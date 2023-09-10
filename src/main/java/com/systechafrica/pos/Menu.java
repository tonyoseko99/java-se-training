package com.systechafrica.pos;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        System.out.println("************ SYSTECH POS SYSTEM ************");
        System.out.println("1. Add Item");
        System.out.println("2. Make Payment");
        System.out.println("3. Display Receipt");
        System.out.println("4. Exit");
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your choice (1-4): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    return choice;
                }
            }
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            scanner.nextLine();
        }
    }
}
