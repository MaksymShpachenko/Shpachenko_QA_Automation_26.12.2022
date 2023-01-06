package com.gilel.Homework;

import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {
                System.out.println("Hi! Let's play a game! What is your name?");
        Scanner scanner_name = new Scanner(System.in);
        String players_name = scanner_name.nextLine();
        double computers_number = (Math.random() * 10);
        int computers_number_int = (int) computers_number;
        System.out.println("Great, " + players_name + "! If you want to win you have to guess an integer number from 0 to 10 I came up with. "
                + "You have 3 attempts. Please, input your number:");
        for (int i = 0; i <= 2; i++) {
            int users_number = 0;
            Scanner scanner_number = new Scanner(System.in);
            while (true) {
                if (scanner_number.hasNextInt()) {
                    users_number = scanner_number.nextInt();
                    break;
                } else {
                    System.out.println("Wrong data! Input integers only!");
                }
                scanner_number.nextLine();
            }
                System.out.println("Lets check!");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                if (users_number == computers_number_int) {
                    System.out.println("Wow! You did it! You win! :)");
                    break;
                } else {
                   System.out.println("It's wrong number. Try again!");
                }
            }
        }
    }