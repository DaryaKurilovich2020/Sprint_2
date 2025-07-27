package org.example.model;


import org.example.model.constants.Discount;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {
        return Discount.DISCOUNT_0;
    }
}
