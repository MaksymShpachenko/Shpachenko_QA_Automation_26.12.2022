package com.gilel.Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner scannerM = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Please, enter number for rows (integer only, better <10).");
        while (true) {
            if (scannerM.hasNextInt()) {
                m = scannerM.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Integers only!");
            }
            scannerM.nextLine();
        }
        System.out.println("Please, enter number for columns (integer only, better <10).");
        while (true) {
            if (scannerN.hasNextInt()) {
                n = scannerN.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Integers only!");
            }
            scannerN.nextLine();
        }
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
