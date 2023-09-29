package com.systechafrica.pos.payment;

import java.util.Scanner;

import com.systechafrica.pos.customFormatter.PointOfSaleFormatter;
import com.systechafrica.pos.items.ItemInterface;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Payment implements PaymentInterface {
    private static final Logger LOGGER = Logger.getLogger(Payment.class.getName());

    @Override
    public void makePayment(List<ItemInterface> items) {
        try {
            LOGGER.addHandler(new FileHandler("db-log.txt", true));
        } catch (SecurityException | IOException e) {
            LOGGER.severe("Error initializing logger " + e.getMessage());
        } 
        LOGGER.getHandlers()[0].setFormatter(new PointOfSaleFormatter());
        
        // Calculate total due and display receipt
        double totalDue = 0;
        System.out.println("************ RECEIPT ************");
        System.out.println("Item Code | Item Name | Quantity | Unit Price | Total");

        for (ItemInterface item : items) {
            double totalItemPrice = item.getQuantity() * item.getPrice();
            System.out.printf("%-10s | %-10s | %-8d | %-10.2f | %-6.2f%n",
                    item.getCode(), item.getName(), item.getQuantity(), item.getPrice(), totalItemPrice); // %-10s means left-justify the string in a 10-character field
                                                                                                        // %n is a platform-independent newline character
                                                                                                        
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
            scanner.nextLine();
        }
    }
}
