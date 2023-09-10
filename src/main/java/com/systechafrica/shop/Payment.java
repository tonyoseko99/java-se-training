package com.systechafrica.shop;

import java.util.List;
import java.util.Scanner;

public class Payment {
    public static void processPayment(List<Item> orderedItems) {
        double totalCost = calculateTotalCost(orderedItems);

        System.out.println("Total Cost: $" + totalCost);

        Scanner scanner = new Scanner(System.in);
        double amountPaid;

        do {
            System.out.print("Enter the amount paid: $");
            amountPaid = scanner.nextDouble();

            if (amountPaid < totalCost) {
                System.out.println("Amount paid is less than the total cost. Please enter a sufficient amount.");
            }
        } while (amountPaid < totalCost);

        double change = amountPaid - totalCost;
        System.out.println("Change: $" + change);
        System.out.println("Payment received. Thank you!");
    }

    private static double calculateTotalCost(List<Item> orderedItems) {
        double totalCost = 0;
        for (Item item : orderedItems) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}
