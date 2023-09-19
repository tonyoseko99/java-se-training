package com.systechafrica.part2.interfaces;

public class LaptopCharger implements ThreePinPlug {

    @Override
    public void plugIn() {
        System.out.println("Laptop charger plugged in");

    }

    @Override
    public void plugOut() {
        System.out.println("Laptop charger plugged out");

    }

}
