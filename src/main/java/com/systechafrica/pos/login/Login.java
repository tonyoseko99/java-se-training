package com.systechafrica.pos.login;

import java.util.Scanner;

public class Login implements LoginInterface {
    private static final String DEFAULT_PASSWORD = "Admin123";
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    private int loginAttempts = 0;

    @Override
    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);

        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(DEFAULT_PASSWORD)) {
                System.out.println("Welcome to the system!");
                return true;
            } else {
                loginAttempts++;
                System.out.println("Incorrect password. Attempts remaining: " + (MAX_LOGIN_ATTEMPTS - loginAttempts));
            }
        }

        System.out.println("You have exceeded the number of login attempts. Access denied.");
        return false;
    }
}
