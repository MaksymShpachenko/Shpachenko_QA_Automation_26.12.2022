package com.gilel.Homework.Dogs;

public abstract class Dog {

    private String type;
    private String size;
    private int averageLifespan;
    private String origin;

    public Dog(String type, String size, int averageLifespan, String origin) {
        this.type = type;
        this.size = size;
        this.averageLifespan = averageLifespan;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public abstract String getDescription();
}
