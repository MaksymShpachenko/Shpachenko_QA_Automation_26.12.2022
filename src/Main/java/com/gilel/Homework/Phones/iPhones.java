package com.gilel.Homework.Phones;

public class iPhones implements Smartphones,IOS {
    String name;

    public iPhones(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println(name + " is calling");

    }

    @Override
    public void sms() {
        System.out.println(name + " is smsing");

    }

    @Override
    public void internet() {
        System.out.println(name + " is interneting");

    }

    @Override
    public void ios() {
        System.out.println(name + " has iOS system");

    }
}
