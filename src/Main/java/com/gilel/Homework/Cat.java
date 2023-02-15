package com.gilel.Homework;

public class Cat {
    private static String name;
    private double age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return (int) age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return (int) weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat(String name, double age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Sten", 12.9, 4.9);
        cat.setName();
        cat.setAge();
        cat.setWeight();

    }
    public void setName() {
        if (name.isEmpty()) {
            System.out.println("Cat's name cannot be empty!");
        }
        else {
            System.out.println("Cat's name is " + name + ".");
        }
    }
    public void setAge() {
        if (age <= 0) {
            System.out.println("Cat's age cannot be less than 0!");
        }
        else {
            System.out.println("Cat's age is " + age + " months.");
        }
    }
    public void setWeight() {
        if (weight <= 0) {
            System.out.println("Cat's weight cannot be less than 0!");
        }
        else {
            System.out.println("Cat's weight is " + weight + " kilograms.");
        }
    }
    }

