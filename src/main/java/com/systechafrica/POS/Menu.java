package com.systechafrica.POS;
import java.util.Scanner;

public class Menu {

    void getMenu() {
        System.out.println(".......................");
        System.out.println("SYSTECH POS SYSTEM");
        System.out.println(".......................");
        System.out.println("1. Add Item");
        System.out.println("2. Make Payment");
        System.out.println("3. Display Receipt");
        System.out.println("");
        System.out.println("Choose an option:");
    }

    // choose an option
    void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Add Item");
                break;
            case 2:
                System.out.println("Make Payment");
                break;
            case 3:
                System.out.println("Display Receipt");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        scanner.close();
    }

}
