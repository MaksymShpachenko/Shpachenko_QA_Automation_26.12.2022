package com.gilel.Homework.Streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MarketProduct {
    private List<Product> products;

    public MarketProduct(List<Product> products) {
        this.products = products;
    }

    public List<String> getProductNames() {
        return products.stream().map(Product::getName).collect(Collectors.toList());
    }

    public List<String> getSortedProductNames() {
        Collections.sort(products, Comparator.comparing(Product::getName));
        return products.stream().map(Product::getName).collect(Collectors.toList());
    }

    public List<Double> getProductPriceBigger10() {
        return products.stream().filter(p -> p.getPrice() > 10.0).map(Product::getPrice).collect(Collectors.toList());
    }

    public List<Double> getProductPriceLess5() {
        return products.stream().filter(p -> p.getPrice() < 5.0).map(Product::getPrice).collect(Collectors.toList());
    }

    public List<String> getPricesInString() {
        return products.stream().map(p->String.valueOf(p.getPrice())).collect(Collectors.toList());
    }
}
