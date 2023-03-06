package com.gilel.Homework.Dogs;

public class Collie extends Dog {
    private ColorOfCollie color;

    public Collie (String type, String size, int averageLifespan, String origin, ColorOfCollie color) {
        super(type, size, averageLifespan, origin);
        this.color = color;
    }
    public ColorOfCollie getColor() {
        return color;
    }

    public void setColor(ColorOfCollie color) {
        this.color = color;
    }
    public String getDescription() {return "Collie belongs to "+ getType() + " type of the dog. It's a " + getSize() + " dog. " +
            "Collie live on average " + getAverageLifespan() + " years. Country of origin - " + getOrigin() + "."+
            " It can be " + getColor() + " color."; };
}
