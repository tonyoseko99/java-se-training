package com.systechafrica.pos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PointOfSale {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        int choice;

        do {
            Menu.displayMenu();
            choice = Menu.getUserChoice();

            switch (choice) {
                case 1:
                    addItem(items);
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
    }

    private static void addItem(List<Item> items) {
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
    }

    private static void displayReceipt(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("No items to display in the receipt.");
            return;
        }

        Payment.makePayment(items); // Display the receipt with total due and payment information
    }
}
