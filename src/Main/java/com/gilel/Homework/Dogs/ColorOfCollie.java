package com.gilel.Homework.Dogs;

public enum ColorOfCollie {

    RED("Red"),
    BLACK("Black"),
    MARBLE("Marble");

    private String name;
    ColorOfCollie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
