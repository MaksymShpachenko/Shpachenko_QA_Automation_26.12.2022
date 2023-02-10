package com.gilel.Homework.Fitnes;

import java.time.Year;

public class ClientCreation {
    private final String name;
    private String surname;
    private final int dayBD;
    private final int monthBD;
    private final int yearBD;
    private final String email;
    private final int phoneNumber;
    private double weight;
    private double pressure;
    private int stepsPerDay;

    public ClientCreation(String name, String surname, int dayBD, int monthBD, int yearBD, String email, int phoneNumber, double weight, double pressure, int stepsPerDay) {
        this.name = name;
        this.surname = surname;
        this.dayBD = dayBD;
        this.monthBD = monthBD;
        this.yearBD = yearBD;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public int getDayBD() {
        return dayBD;
    }

    public int getMonthBD() {
        return monthBD;
    }

    public int getYearBD() {
        return yearBD;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getWight() {
        return weight;
    }

    public void setWeight(double wight) {
        this.weight = wight;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {

        this.stepsPerDay = stepsPerDay;

    }

    public void printAccountInfo() {
        int year = Year.now().getValue();
        int age = year - yearBD;

        System.out.println("Account for " + name + " " + surname + " is created!" +
                " Client's information: BD: " + dayBD + "." + monthBD +
                "." + yearBD+ ";" + " Age: " + age +  "; Email: "+ email + "; Phone Number: " + phoneNumber + "; Weight: " + weight + " kilograms" +
                "; Blood pressure: " + pressure + "; Steps per day: " + stepsPerDay + ".");

    }
}
