package com.gilel.Homework;

import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {
        int frags_player1_teamName1 = 0;
        int frags_player2_teamName1 = 0;
        int frags_player3_teamName1 = 0;
        int frags_player4_teamName1 = 0;
        int frags_player5_teamName1 = 0;
        int frags_player1_teamName2 = 0;
        int frags_player2_teamName2 = 0;
        int frags_player3_teamName2 = 0;
        int frags_player4_teamName2 = 0;
        int frags_player5_teamName2 = 0;
        System.out.println("Hello! If you want to play a game enter a name for the first team:");
        Scanner scanner1 = new Scanner(System.in);
        String teamName1 = scanner1.nextLine();

        System.out.println("Please, enter frags for the first player from the first team (integers only):");
        if (scanner1.hasNextInt()) {
            frags_player1_teamName1 = scanner1.nextInt();
            scanner1.nextLine();
            System.out.println("Please, enter frags for the second player from the first team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner1.hasNextInt()) {
            frags_player2_teamName1 = scanner1.nextInt();
            scanner1.nextLine();
            System.out.println("Please, enter frags for the third player from the first team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner1.hasNextInt()) {
            frags_player3_teamName1 = scanner1.nextInt();
            scanner1.nextLine();
            System.out.println("Please, enter frags for the fourth player from the first team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner1.hasNextInt()) {
            frags_player4_teamName1 = scanner1.nextInt();
            scanner1.nextLine();
            System.out.println("Please, enter frags for the fifth player from the first team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner1.hasNextInt()) {
            frags_player5_teamName1 = scanner1.nextInt();
            scanner1.nextLine();
            System.out.println("Great scores for the team " + teamName1 + "!");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, enter a name for the second team:");
        String teamName2 = scanner2.nextLine();

        System.out.println("Please, enter frags for the first player from the second team (integers only):");
        if (scanner2.hasNextInt()) {
            frags_player1_teamName2 = scanner2.nextInt();
            scanner2.nextLine();
            System.out.println("Please, enter frags for the second player from the second team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner2.hasNextInt()) {
            frags_player2_teamName2 = scanner2.nextInt();
            scanner2.nextLine();
            System.out.println("Please, enter frags for the third player from the second team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner2.hasNextInt()) {
            frags_player3_teamName2 = scanner2.nextInt();
            scanner2.nextLine();
            System.out.println("Please, enter frags for the fourth player from the second team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner2.hasNextInt()) {
            frags_player4_teamName2 = scanner2.nextInt();
            scanner2.nextLine();
            System.out.println("Please, enter frags for the fifth player from the second team (integers only):");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
        if (scanner2.hasNextInt()) {
            frags_player5_teamName2 = scanner2.nextInt();
            scanner2.nextLine();
            System.out.println("Great scores for the team " + teamName2 + "!");
        } else {
            System.out.println("Wrong data! Please, start from the very beginning!");
            System.exit(0);
        }
            System.out.println("The game begins! Wait for result.");
        int average_teamName1 = (frags_player1_teamName1 + frags_player2_teamName1 + frags_player3_teamName1 + frags_player4_teamName1 + frags_player5_teamName1)/5;
        int average_teamName2 = (frags_player1_teamName2 + frags_player2_teamName2 + frags_player3_teamName2 + frags_player4_teamName2 + frags_player5_teamName2)/5;
        if (average_teamName1 > average_teamName2) {
            System.out.println ("Result: " + teamName1 + " has won a game!");
        } else if (average_teamName1 < average_teamName2) {
            System.out.println("Result: " + teamName2 + " has won a game!");
        } else {
            System.out.println("Result: No one has won a game!");
        }
    }
}