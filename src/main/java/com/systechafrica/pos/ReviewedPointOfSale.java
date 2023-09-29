package com.systechafrica.pos;

import java.util.Scanner;

import com.systechafrica.pos.customFormatter.PointOfSaleFormatter;
import com.systechafrica.pos.items.Item;
import com.systechafrica.pos.items.ItemInterface;
import com.systechafrica.pos.jdbc.DBUtils;
import com.systechafrica.pos.login.Login;
import com.systechafrica.pos.menu.Menu;
import com.systechafrica.pos.payment.Payment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class ReviewedPointOfSale {
    private static final Logger LOGGER = Logger.getLogger(ReviewedPointOfSale.class.getName());
    public static void main(String[] args) throws SQLException {
        try {
            LOGGER.addHandler(new FileHandler("db-log.txt", true));
        } catch (SecurityException | IOException e ) {
            LOGGER.severe("Error initializing logger " + e.getMessage());
        } 
        LOGGER.getHandlers()[0].setFormatter(new PointOfSaleFormatter());
        
        Login login = new Login();
        Menu menu = new Menu();
        Payment payment = new Payment();
        DBUtils dbUtils = new DBUtils();

        // Authenticate the user
        if (login.authenticate()) {
            // Create an empty list to hold items
            List<ItemInterface> items = new ArrayList<>();

            // Display the menu and get user choice
            int choice;

            do {
                menu.displayMenu();
                choice = menu.getUserChoice();

                switch (choice) {
                    case 1:
                        addItem(items);
                        break;
                    case 2:
                        if (!items.isEmpty()) {
                            payment.makePayment(items);
                            LOGGER.info("Payment made successfully.");
                        } else {
                            LOGGER.warning("No items to display in the receipt.");
                        }
                        break;
                    case 3:
                        displayReceipt(items);
                        LOGGER.info("Receipt displayed successfully.");
                        break;
                    case 4:
                        LOGGER.info("Exiting the system. Goodbye!");
                        break;
                }
            } while (choice != 4);
        } else {
            LOGGER.warning("Authentication failed. Exiting the system.");
        }
    }

    // Add an item to the list

    private static void addItem(List<ItemInterface> items) { // Add an item to the list
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter item code: ");
            String code = scanner.nextLine();

            System.out.println("Enter item name: ");
            String name = scanner.nextLine();

            System.out.println("Enter item quantity: ");
            int quantity = scanner.nextInt();

            System.out.println("Enter item price: ");
            double price = scanner.nextDouble();

            ItemInterface item = new Item(code, name, quantity, price);
            items.add(item);

            addItemToDatabase(item);
        } catch (Exception e) {
            LOGGER.severe("Error adding item " + e.getMessage());
        }
    }

    // Display the receipt with total due and payment information
    public static void displayReceipt(List<ItemInterface> items) {
        try {
            if (items.isEmpty()) {
                System.out.println("No items to display in the receipt.");
                return;
            }

            System.out.println("Item Code\tItem Name\tQuantity\tUnit Price\tTotal Price");
            System.out.println("---------\t---------\t--------\t----------\t-----------");

            double total = 0;
            for (ItemInterface item : items) {
                System.out.println(item.getCode() + "\t\t" + item.getName() + "\t\t" + item.getQuantity() + "\t\t" + item.getPrice() + "\t\t" + (item.getQuantity() * item.getPrice()));
                total += item.getQuantity() * item.getPrice();
            }

            System.out.println("\nTotal : $" + total);
        } catch (Exception e) {
            LOGGER.severe("Error displaying receipt " + e.getMessage());
        }


    }

    private static void addItemToDatabase(ItemInterface item) {
        try {
            Connection connection = DBUtils.getConnection();
            String sql = "INSERT INTO items (code, name, quantity, price) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, item.getCode());
            statement.setString(2, item.getName());
            statement.setInt(3, item.getQuantity());
            statement.setDouble(4, item.getPrice());

            statement.executeUpdate();
            connection.close();
        } catch (Exception e) {
            LOGGER.severe("Error adding item to database " + e.getMessage());
        }
    }
}
