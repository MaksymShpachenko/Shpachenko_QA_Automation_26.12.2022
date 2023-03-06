package com.gilel.Homework.Dogs;

public class Main {
    public static void main(String[] args) {
        Dobermann dobermann = new Dobermann("guard", "big", 11, "Germany");
        Collie collie = new Collie("shepherd", "big", 14, "Scotland", ColorOfCollie.RED);
        BorderCollie borderCollie = new BorderCollie("shepherd", "average-size", 12, "Scotland", ColorOfCollie.BLACK);
        System.out.println(dobermann.getDescription());
        System.out.println(collie.getDescription());
        System.out.println(borderCollie.getDescription());
        borderCollie.subspecies();
    }
}
