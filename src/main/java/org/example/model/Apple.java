package org.example.model;

import org.example.model.constants.Colour;
import org.example.model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.RED)) {
            return Discount.DISCOUNT_60;
        }
        return Discount.DISCOUNT_0;
    }
}
