package com.systechafrica.POS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddItem {
    // List to store added items
    private List<Item> items = new ArrayList<>();

    // Add item method
    public void addItem() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Item Code (or 'q' to quit adding items): ");
            String itemCode = scanner.nextLine();

            if (itemCode.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("Enter Unit Price: ");
            double price = scanner.nextDouble();

            // Create a new Item and add it to the list
            Item item = new Item(itemCode, quantity, price);
            items.add(item);

            scanner.nextLine();
            System.out.println("Item added successfully!");

            System.out.println("Do you want to add another item? (Y/N): ");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("y")) {
                Menu menu = new Menu();
                menu.getMenu();
            }
        }

        scanner.close();
    }

    // Get the list of added items
    public List<Item> getItems() {
        return items;
    }
}
