package com.gilel.Homework.Burgers;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classicBurger = new Burger ("bun", "meat", "salad", "cheese", "mayo");
        Burger burgerWithoutMayo = new Burger ("bun", "meat", "salad", "cheese");
        Burger veganBurger = new Burger ("bun", "meat", "salad");
    }
}
