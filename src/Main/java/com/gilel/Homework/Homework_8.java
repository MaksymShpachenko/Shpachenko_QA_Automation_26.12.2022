package com.gilel.Homework;

import java.sql.SQLOutput;

public class Homework_8 {
    public static void main(String[] args) {
        int current_number = 0;
        int shuttle_number = 0;
                while (shuttle_number < 100) {
            current_number++;
            String shuttle_number_str = Integer.toString(current_number);
            boolean find4 = shuttle_number_str.contains("4");
            boolean find9 = shuttle_number_str.contains("9");
            if (!find4 && !find9) {
                System.out.println("Shuttle's sequence number: " + shuttle_number + ", Number for this shuttle: " + shuttle_number_str);
                shuttle_number++;
            }

        }
    }
}
