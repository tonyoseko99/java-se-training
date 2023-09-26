package com.systechafrica.pos;

import java.util.Scanner;

import com.systechafrica.pos.jdbc.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PointOfSale {
    public static void main(String[] args) {
        // Create a Login object to handle authentication
        Login login = new Login();

        // Authenticate the user
        if (login.authenticate()) {
            // Create an empty list to hold items
            List<Item> items = new ArrayList<>();

            // Display the menu and get user choice
            int choice;

            do {
                Menu.displayMenu();
                choice = Menu.getUserChoice();

                switch (choice) {
                    case 1:
                        try {
                            addItem(items);
                        } catch (SQLException e) {
                            System.out.println("Error adding item to the database: " + e.getMessage());
                        }
                        break;
                    case 2:
                        if (!items.isEmpty()) {
                            Payment.makePayment(items);
                        } else {
                            System.out.println("No items to process payment. Please add items first.");
                        }
                        break;
                    case 3:
                        displayReceipt(items);
                        break;
                    case 4:
                        System.out.println("Exiting the system. Goodbye!");
                        break;
                }
            } while (choice != 4);
        } else {
            System.out.println("Access denied. Exiting the system. Goodbye!");
        }
    }

    private static void addItem(List<Item> items) throws SQLException { // Add an item to the list
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Unit Price: $");
        double price = scanner.nextDouble();

        Item item = new Item(code, name, quantity, price);
        items.add(item);
        System.out.println("Item added successfully.");

        // Add the item to the database
        addItemToDatabase(item);
    }

    // Display the receipt with total due and payment information
    private static void displayReceipt(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("No items to display in the receipt.");
            return;
        }

        Payment.makePayment(items); // Display the receipt with total due and payment information
    }

    private static void addItemToDatabase(Item item) throws SQLException {
        Connection connection = DBUtils.getConnection();
        String sql = "INSERT INTO items (code, name, quantity, price) VALUES (?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, item.getCode());
        statement.setString(2, item.getName());
        statement.setInt(3, item.getQuantity());
        statement.setDouble(4, item.getPrice());

        statement.executeUpdate();
        connection.close();
    }
}
