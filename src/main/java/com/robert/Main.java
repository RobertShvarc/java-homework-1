package com.robert;

public class Main {

    char aChar = 'c';

    byte aByte = 1;
    short aShort = 2;
    int anInt = 3;
    long aLong = 4;

    float aFloat = 0.23f;
    double aDouble = 0.23;

    boolean aBoolean = true;

    String aString = "Hi";

    public static void main(String[] args) {
    WebSite newsSite = new WebSite("yandex.ru/news", false);
    WebSite ytSite = new WebSite("youtube.com", true);

    boolean isSiteFunny = newsSite.isThisSiteIsFunny();

    newsSite.setViewCount(10);
    newsSite.open();
    ytSite.open();

    newsSite.printItems();

//    System.out.println(isSiteFunny);
//    System.out.println(newsSite.viewCount);
//    System.out.println(ytSite.viewCount);
    }
}

