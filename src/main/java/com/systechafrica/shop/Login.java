package com.systechafrica.shop;

import java.util.Scanner;

public class Login {
    private static final String DEFAULT_PASSWORD = "Admin123";
    private static final int MAX_ATTEMPTS = 3;

    public void authenticate(){
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        while (!password.equals(DEFAULT_PASSWORD) && attempts < MAX_ATTEMPTS) {
            System.out.println("Invalid password. Please try again.");
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            attempts++;
        }

        
    }
}
