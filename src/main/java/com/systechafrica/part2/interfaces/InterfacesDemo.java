package com.systechafrica.part2.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        ThreePinPlug laptopCharger = new LaptopCharger();
        laptopCharger.plugIn();
        laptopCharger.plugOut();
        
        ThreePinPlug mobileCharger = new MobileCharger();
        mobileCharger.plugIn();
        mobileCharger.plugOut();

    }
}
