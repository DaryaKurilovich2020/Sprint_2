package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Meat meatVar = new Meat(5, 100);
        Apple redApplesVar = new Apple(10,50, Colour.RED);
        Apple greenApplesVar = new Apple(8,60, Colour.GREEN);

        List<Food> foodList = new ArrayList<>();
        foodList.add(meatVar);
        foodList.add(redApplesVar);
        foodList.add(greenApplesVar);

        ShoppingCart shoppingCart = new ShoppingCart(foodList);

        System.out.println("Общая суммы товаров без скидки " + shoppingCart.getCartSummaryNoDiscount());
        System.out.println("Общая суммы товаров со скидкой " + shoppingCart.getCartSummaryWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getCartVegetarianSummaryNoDiscount());
    }
}