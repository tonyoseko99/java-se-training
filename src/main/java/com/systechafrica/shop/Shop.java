package com.systechafrica.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        // Initialize menu items
        List<Item> items = new ArrayList<>();
        items.add(new Item("Chai", 15.0));
        items.add(new Item("Andazi", 10.0));
        items.add(new Item("Tosti", 12.0));
        items.add(new Item("NDENGU AND ACCOMPLISHMENTS", 70.0));
        items.add(new Item("BEANS AND ACCOMPLISHMENTS", 70.0));
        items.add(new Item("PILAU VEG", 90.0));

        // Create an order object
        Order order = new Order();

        // Create a menu object to display the menu
        Menu menu = new Menu();

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a login object for authentication
        Login login = new Login();

        // Authenticate the user
        if (login.authenticate()) {
            boolean ordering = true;

            while (ordering) {
                menu.displayMenu(items);

                System.out.print("Enter your choice (1-" + items.size() + "): ");
                int choice = scanner.nextInt();

                if (choice >= 1 && choice <= items.size()) {
                    Item selectedItem = items.get(choice - 1);
                    order.addItem(selectedItem);
                    System.out.println(selectedItem.getName() + " added to your order.");
                } else {
                    System.out.println("Invalid choice. Please select a valid menu item.");
                }

                System.out.print("Do you want to continue ordering (Y/N)? ");
                String continueOrdering = scanner.next();

                if (!continueOrdering.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }

            if (!order.getOrderedItems().isEmpty()) {
                System.out.println("\nYour order:");
                Payment.processPayment(order.getOrderedItems());
            } else {
                System.out.println("No items ordered. Thank you!");
            }
        } else {
            System.out.println("Access denied. Exiting the system.");
        }
    }
}
