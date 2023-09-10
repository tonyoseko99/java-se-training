package com.systechafrica.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> orderedItems;

    public Order() {
        orderedItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        orderedItems.add(item);
    }

    public List<Item> getOrderedItems() {
        return orderedItems;
    }
}
