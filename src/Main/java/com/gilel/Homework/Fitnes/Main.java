package com.gilel.Homework.Fitnes;

public class Main {
    public static void main(String[] args) {
                ClientCreation client1 = new ClientCreation("Bob", "Marley", 6,12, 1945,
                "bob@gamil.com", 4568975, 70.84, 120, 4000);
        ClientCreation client2 = new ClientCreation("Jason", "Statham", 26,7, 1967,
                "jason@gmail.com", 3278965, 78.12, 130,8600);
        ClientCreation client3 = new ClientCreation("John", "Travolta", 18,12,1954,
                "john@gmail.com", 8886611, 90.6,115,6200);
        ClientCreation client4 = new ClientCreation("Vinnie", "Jones", 5, 1, 1965,
                "vinnie@gmail.com", 3658941, 89.9, 125, 10800);
        ClientCreation client5 = new ClientCreation("Violante", "Placido", 1,5,1976,
                "violante@gmail.com", 7956321, 52.3, 140, 5800);
        System.out.println("Before changes:");
        client1.printAccountInfo();
        client2.printAccountInfo();
        client3.printAccountInfo();
        client4.printAccountInfo();
        client5.printAccountInfo();

        client3.setWeight(88.1);
        client3.setPressure(120);
        client3.setStepsPerDay(7100);

        client5.setWeight(51.9);
        client5.setPressure(135);
        client5.setStepsPerDay(6400);
        System.out.println();
        System.out.println("After changes:");
        client1.printAccountInfo();
        client2.printAccountInfo();
        client3.printAccountInfo();
        client4.printAccountInfo();
        client5.printAccountInfo();
    }
    }

