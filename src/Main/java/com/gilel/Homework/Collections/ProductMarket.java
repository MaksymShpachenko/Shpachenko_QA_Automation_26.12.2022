package com.gilel.Homework.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {

        this.products = products;
    }

    public List<String> getName() {
        ArrayList<String> names = new ArrayList<>();
        for (Product p : products) {
            names.add(p.getName());
        }
        return names;
    }
    public List<String> getSortedName() {
        ArrayList<String> sortedNames = new ArrayList<>();
        for (Product p : products) {
            sortedNames.add(p.getName());
        }
        Collections.sort(sortedNames);
        return sortedNames;
    }

    public List<Integer> getPriceBiggerThan10() {
        ArrayList<Integer> prices = new ArrayList<>();
        for (Product p : products) {
            int current = p.getPrice();
            if (current > 10)
            prices.add(current);
        }
        return prices;
    }

    public List<Integer> getPriceLessThan5() {
        ArrayList<Integer> prices = new ArrayList<>();
        for (Product p : products) {
            int current = p.getPrice();
            if (current < 5)
                prices.add(current);
        }
        return prices;
    }
    public List<String> getPriceString() {
        ArrayList<String> prices = new ArrayList<>();
        for (Product p : products) {
            prices.add(String.valueOf(p.getPrice()));
        }
        return prices;
    }
}

