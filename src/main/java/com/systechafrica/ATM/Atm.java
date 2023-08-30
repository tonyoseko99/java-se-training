package com.systechafrica.ATM;

import java.util.Scanner;

public class Atm {
    double balance = 1000.0;
    final String PASSWORD = "Admin123";
    int loginAttempts = 0;

    // user input
    Scanner scan = new Scanner(System.in);

    public void login() {
        System.out.println("Enter your password: ");
        String password = scan.nextLine();
        // check if password is correct
        if (password.equals(PASSWORD)) {
            System.out.println("Login successful");
            // call the menu method
            menu();
        } else {
            loginAttempts++;
            if (loginAttempts < 3) {
                System.out.println("Incorrect password, try again");
                login();
            } else {
                System.out.println("Too many login attempts, try again later");
            }
        }

    }

    public static void main(String[] args) {

        Atm atm = new Atm();
        atm.login();

    }
}
