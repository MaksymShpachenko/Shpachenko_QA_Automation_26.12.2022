package com.gilel.Homework.Phones;

public class Androids implements Smartphones, LinuxOS {

    String name;

    public Androids(String name) {
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
    public void linuxOS() {
        System.out.println(name + " has Linux system");

    }
}
