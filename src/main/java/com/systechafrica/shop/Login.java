package com.systechafrica.shop;

import java.util.Scanner;

public class Login {
    private static final String DEFAULT_PASSWORD = "Admin123";
    private static final int MAX_ATTEMPTS = 3;
    private int loginAttempts = 0;

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        while (loginAttempts < MAX_ATTEMPTS) {
            System.out.print("Input Password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(DEFAULT_PASSWORD)) {
                System.out.println("Welcome to Systech Restaurant");
                return true;
            } else {
                loginAttempts++;
                System.out.println(
                        "Incorrect Password. Try again " + (MAX_ATTEMPTS - loginAttempts) + "attemps remaining.");
            }
        }
        System.out.println("You have exceeded the number of login attempts. Access denied.");
        return false;

    }
}
