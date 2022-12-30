package com.gilel.Homework;

public class Homework_4 {
    public static void main(String[] args) {
        long side_a = 6; //length
        long side_b = 3; //width
        long side_c = 2; //height
        long volume = Math.multiplyExact(side_a, side_b) * side_c;
        long length = (side_a + side_b + side_c) * 4;
            System.out.println("Об'єм паралелепіпеда = " + volume);
            System.out.println("Довжина паралелепіпеда = " + length);
    }
}
