package com.gilel.Homework.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tomato", 5.0));
        products.add(new Product("Potato", 1.0));
        products.add(new Product("Meat", 11.0));
        products.add(new Product("Water", 4.0));
        products.add(new Product("Juice", 7d));
        products.add(new Product("Fish", 17d));
        products.add(new Product("Apple", 3d));
        products.add(new Product("Banana", 4d));
        products.add(new Product("Sugar", 8.0));
        products.add(new Product("Flour", 6d));
        MarketProduct marketproduct = new MarketProduct(products);


        System.out.println("All products:");
        List<String> ProductNames = marketproduct.getProductNames();
        System.out.println(ProductNames);
        System.out.println();

        System.out.println("All products sorted by name:");
        List<String> SortedProductNames = marketproduct.getSortedProductNames();
        System.out.println(SortedProductNames);
        System.out.println();

        System.out.println("Prices for products bigger than 10:");
        List<Double> BiggerThan10 = marketproduct.getProductPriceBigger10();
        System.out.println(BiggerThan10);
        System.out.println();

        System.out.println("Prices for products less than 5:");
        List<Double> LessThan5 = marketproduct.getProductPriceLess5();
        System.out.println(LessThan5);
        System.out.println();

        System.out.println("Prices for all products in string:");
        List<String> StringPrice = marketproduct.getPricesInString();
        System.out.println(StringPrice);
    }
}
