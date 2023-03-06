package com.gilel.Homework.Dogs;

public class Dobermann extends Dog {
    public Dobermann(String type, String size, int averageLifespan, String origin) {
        super(type, size, averageLifespan, origin);
    }
    public String getDescription() {return "Doberman belongs to "+ getType() + " type of the dog. It's a " + getSize() + " dog. " +
            "Dobermans live on average " + getAverageLifespan() + " years. Country of origin - " + getOrigin() + ".";}
}
