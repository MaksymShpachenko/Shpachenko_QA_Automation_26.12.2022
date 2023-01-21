package com.gilel.Homework.Burgers;


public class Burger {
    String bun;
    String meat;
    String salad;
    String cheese;
    String mayo;

    public Burger(String bun, String meat, String salad, String cheese, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.salad = salad;
        this.cheese = cheese;
        this.mayo = mayo;
        System.out.println("Burger consists of "+ this.bun + ", " + this.meat + ", " + this.salad + ", " + this.cheese + " and " + this.mayo + " is created!");
    }

    public Burger(String bun, String meat, String salad, String cheese) {
        this.bun = bun;
        this.meat = meat;
        this.salad = salad;
        this.cheese = cheese;
        System.out.println("Burger consists of "+ this.bun + ", " + this.meat + ", " + this.salad + " and " + this.cheese + " is created!");
    }

    public Burger(String bun, String salad, String cheese) {
        this.bun = bun;
        this.salad = salad;
        this.cheese = cheese;
        System.out.println("Burger consists of "+ this.bun + ", " + this.salad + " and " + this.cheese + " is created!");
    }
}
