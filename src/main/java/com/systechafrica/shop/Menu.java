package com.systechafrica.shop;

import java.util.List;

public class Menu {
    public static void displayMenu(List<Item> items) {
        System.out.println("************ SYSTECH RESTAURANT MENU ************");
        int itemNumber = 1;

        for (Item item : items) {
            System.out.println(itemNumber + ". " + item.getName() + " - $" + item.getPrice());
            itemNumber++;
        }

        System.out.println("****************************************************");
    }
}
