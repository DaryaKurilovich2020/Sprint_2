package org.example.service;


import org.example.model.Food;

import java.util.List;

public class ShoppingCart {
    private List<Food> foodList;

    public ShoppingCart(List<Food> foodList) {
        this.foodList = foodList;
    }

    public double getCartSummaryNoDiscount() {
        return getCartSummary(false, false, false);
    }

    public double getCartSummaryWithDiscount() {
        return getCartSummary(true, false, false);
    }

    public double getCartVegetarianSummaryNoDiscount() {
        return getCartSummary(false, true, true);
    }

    private double getCartSummary(Boolean includeDiscount, Boolean includeVegetarian, Boolean vegetarianOption) {
        double cartSummary = 0;

        for (Food foodVar : this.foodList) {
            if (includeDiscount && includeVegetarian) {
                if (foodVar.isVegetarian() == vegetarianOption) {
                    cartSummary += (100 - foodVar.getDiscount()) / 100 * foodVar.getPrice() * foodVar.getAmount();
                }
            } else if (includeDiscount) {
                cartSummary += (100 - foodVar.getDiscount()) / 100 * foodVar.getPrice() * foodVar.getAmount();
            } else if (includeVegetarian) {
                if (foodVar.isVegetarian() == vegetarianOption) {
                    cartSummary += foodVar.getPrice() * foodVar.getAmount();
                }
            } else {
                cartSummary += foodVar.getPrice() * foodVar.getAmount();
            }
        }
        return cartSummary;
    }
}
