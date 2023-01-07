package com.gilel.Homework;


public class Homework_9 {
    public static void main(String[] args) {
        int[] team_1 = new int[25];
        int[] team_2 = new int[25];
        {
            System.out.print("Age of players of the first team: ");
        for (int i = 0; i < team_1.length; i++) {
            team_1[i] = (18 + (int) (Math.random() * 23));
        }
        for (int i = 0; i < team_1.length; i++) {
            if (team_1.length - 1 == i) {
                System.out.println(team_1[i] + ".");
            } else {
                System.out.print(team_1[i] + ",");
            }
        }
            int average_age_team_1 = 0;
            for (int value1 : team_1) {
                average_age_team_1 += value1;
            }
        System.out.println("Average age: " + average_age_team_1 / team_1.length);
        }
        System.out.print("Age of players of the second team: ");
        for (int y = 0; y < team_2.length; y++) {
            team_2[y] = (18 + (int) (Math.random() * 23));
        }
        for (int y = 0; y < team_2.length; y++) {
            if (team_2.length - 1 == y) {
                System.out.println(team_2[y] + ".");
            } else {
                System.out.print(team_2[y] + ",");
            }
        }
        int average_age_team_2 = 0;
        for (int value2 : team_2) {
            average_age_team_2 += value2;
        }
        System.out.println("Average age: " + average_age_team_2 / team_1.length);


   //     int average_age_team_2 = 0;
    }
}
