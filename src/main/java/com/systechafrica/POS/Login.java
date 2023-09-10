package com.systechafrica.POS;

import java.util.Scanner;

public class Login {
    String password = "Admin123";
    int loginAttempts = 0;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String input = scanner.nextLine();

        // Compare the input with the password
        if (input.equals(password)) {
            System.out.println("Welcome to the system");
            Menu menu = new Menu();
            menu.getMenu();

        } else {
            loginAttempts++;
            if (loginAttempts < 3) {
                System.out.println("Incorrect password. Try again");
                login();
            } else {
                System.out.println("You have exceeded the number of login attempts");
            }
        }
        scanner.close();
    }
}
