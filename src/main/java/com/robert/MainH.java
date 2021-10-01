package com.robert;

public class MainH {

    public static void main(String[] args) {
        Transmission carName = new Transmission("Honda", true, 5);
        Transmission carName1 = new Transmission("Mersedes", false, 3);
        System.out.println("*******");
        System.out.println(carName.carName);
        System.out.println(carName.doors);
        System.out.println("manual  " + carName.isManual);
        carName.autoservice(6);
        System.out.println(carName.doors);
    }

}
