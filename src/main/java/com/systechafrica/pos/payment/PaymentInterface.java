package com.systechafrica.pos.payment;

import java.util.List;

import com.systechafrica.pos.items.ItemInterface;

public interface PaymentInterface {
    void makePayment(List<ItemInterface> items);
}
