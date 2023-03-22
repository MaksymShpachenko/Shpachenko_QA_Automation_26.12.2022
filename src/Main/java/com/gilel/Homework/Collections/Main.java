package com.gilel.Homework.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args) {
            Product tomato = new Product("Tomato", 5);
            Product potato = new Product("Potato", 1);
            Product meat = new Product("Meat", 11);
            Product water = new Product("Water", 4);
            Product juice = new Product("Juice", 7);
            Product fish = new Product("Fish",17);
            Product apple = new Product("Apple", 3);
            Product banana = new Product("Banana", 4);
            Product sugar = new Product("Sugar", 8);
            Product flour = new Product("Flour", 6);

            ArrayList<Product> products = new ArrayList();
            products.add(tomato);
            products.add(potato);
            products.add(meat);
            products.add(water);
            products.add(juice);
            products.add(fish);
            products.add(apple);
            products.add(banana);
            products.add(sugar);
            products.add(flour);

            ProductMarket productmarket = new ProductMarket(products);
            List<String> string = productmarket.getName();
        System.out.println("All products:");
            System.out.println(string);
        System.out.println();

        System.out.println("All products sorted by name:");
        List<String> stringSorted = productmarket.getSortedName();
        System.out.println(stringSorted);
        System.out.println();

        System.out.println("Prices for products bigger than 10:");
        List<Integer> pricesBiggerThan10 = productmarket.getPriceBiggerThan10();
            System.out.println(pricesBiggerThan10);
        System.out.println();

        System.out.println("Prices for products less than 5:");
        List<Integer> pricesLessThan5 = productmarket.getPriceLessThan5();
            System.out.println(pricesLessThan5);
        System.out.println();


        System.out.println("Prices for all products in string:");
        List<String> allPrices = productmarket.getPriceString();
            System.out.println(allPrices);
    }
}
