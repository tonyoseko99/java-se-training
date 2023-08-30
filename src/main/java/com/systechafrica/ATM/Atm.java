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

    public void menu() {
        while (true) {
            System.out.println("\n****************");
            System.out.println("ATM SIMULATOR");
            System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
            System.out.println("ATM SERVICES");
            System.out.println("__________________");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Cash");
            System.out.println("5. Quit");
            System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
            System.out.println("Choose your option:");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    balance += depositAmount;
                    System.out.println("Your balance is: " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        // apply withdrawal charges of 2%
                        double charges = withdrawAmount * 0.02;
                        balance -= (withdrawAmount + charges);
                        System.out.println("Your balance is: " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Enter amount to transfer: ");
                    double transferAmount = scan.nextDouble();
                    if (transferAmount > balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        balance -= transferAmount;
                        System.out.println("Your balance is: " + balance);
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }
        }
    }

    public static void main(String[] args) {

        Atm atm = new Atm();
        atm.login();
        atm.menu();

    }
}
