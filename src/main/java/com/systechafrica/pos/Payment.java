package com.systechafrica.pos;

import java.util.Scanner;
import java.util.List;

public class Payment {
    public static void makePayment(List<Item> items) {
        // Calculate total due and display receipt
        double totalDue = 0;
        System.out.println("************ RECEIPT ************");
        System.out.println("Item Code | Item Name | Quantity | Unit Price | Total");

        for (Item item : items) {
            double totalItemPrice = item.getQuantity() * item.getPrice();
            System.out.printf("%-10s | %-10s | %-8d | %-10.2f | %-6.2f%n",
                    item.getCode(), item.getName(), item.getQuantity(), item.getPrice(), totalItemPrice);
            totalDue += totalItemPrice;
        }

        System.out.println("\nTotal Due: $" + totalDue);

        // Ask for amount paid and calculate change
        double amountPaid = getUserInput("Enter Amount Paid: $");
        while (amountPaid < totalDue) {
            System.out.println("Amount paid is less than the total due. Please enter a sufficient amount.");
            amountPaid = getUserInput("Enter Amount Paid: $");
        }

        double change = amountPaid - totalDue;
        System.out.println("Change: $" + change);
        System.out.println("Thank you for shopping with us!");
    }

    private static double getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.nextLine(); // Consume invalid input
        }
    }
}
