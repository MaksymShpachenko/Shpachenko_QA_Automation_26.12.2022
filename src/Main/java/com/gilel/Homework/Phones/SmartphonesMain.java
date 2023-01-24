package com.gilel.Homework.Phones;

public class SmartphonesMain {
    public static void main(String[] args) {

        iPhones iphone = new iPhones("iPhone");
        Androids android = new Androids("Android");
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.ios();

        System.out.println();

        android.call();
        android.sms();
        android.internet();
        android.linuxOS();

    }
}
