package com.gilel.Homework.Dogs;

public class BorderCollie extends Dog implements Subspecies {
    private ColorOfCollie color;
    public BorderCollie(String type, String size, int averageLifespan, String origin, ColorOfCollie color) {
        super(type, size, averageLifespan, origin);
        this.color = color;
    }
    public ColorOfCollie getColor() {
        return color;
    }

    public void setColor(ColorOfCollie color) {
        this.color = color;
    }
    public String getDescription() {return "Border collie belongs to "+ getType() + " type of the dog. It's a " + getSize() + " dog. " +
            "Border collie live on average " + getAverageLifespan() + " years. Country of origin - " + getOrigin() + "." +
            " It can be " + getColor() + " color.";}

    @Override
    public void subspecies() {System.out.println("Border collie is a subspecies of Collie.");
    }

}
