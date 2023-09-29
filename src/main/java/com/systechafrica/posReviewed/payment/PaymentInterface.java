package com.systechafrica.posReviewed.payment;

import java.util.List;

import com.systechafrica.posReviewed.items.ItemInterface;

public interface PaymentInterface {
    void makePayment(List<ItemInterface> items);
}
