package com.systechafrica.shop;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        System.out.println(".......................................................");
        System.out.println("..................SYSTECH RESTAURANT..................");
        System.out.println(".......................................................");

        System.out.println("DRINKS");
        System.out.println(".......................................................");
        System.out.println("1. Chai.................15");
        System.out.println("2. Andazi...............10");
        System.out.println("3. Tosti................12");
        System.out.println("");
        System.out.println("MEALS");
        System.out.println(".......................................................");
        System.out.println("4. NDENGU AND ACCOMPLISHMENTS................70");
        System.out.println("5. BEANS AND ACCOMPLISHMENTS.................70");
        System.out.println("6. PILAU VEG.................................90");
        System.out.println("7. QUIT");

    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice (1-7): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 7) {
                    return choice;
                }
            }
            System.out.println("Invalid Input. Enter a number between 1 and 7");
            scanner.nextLine();
        }

    }
}
