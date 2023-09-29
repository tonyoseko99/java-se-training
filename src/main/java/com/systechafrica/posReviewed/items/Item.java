package com.systechafrica.posReviewed.items;

public class Item implements ItemInterface {
    private String code;
    private String name;
    private int quantity;
    private double price;

    public Item(String code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
