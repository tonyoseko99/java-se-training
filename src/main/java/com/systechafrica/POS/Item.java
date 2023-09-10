package com.systechafrica.POS;

public class Item {
    private String code;
    private int quantity;
    private double price;

    public Item(String code, int quantity, double price) {
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters

    public String getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
