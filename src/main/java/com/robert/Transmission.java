package com.robert;

public class Transmission {

    String carName;
    int doors;
    boolean isManual;
    String[] transmissionItems = {"Manual", "auto", "robot"};

    public Transmission(String name, boolean isManual, int doors) {
        this.carName = name;
        this.isManual = isManual;
        this.doors = doors;
    }

    public void autoservice(int doors){
        this.doors = doors;
    }
}
