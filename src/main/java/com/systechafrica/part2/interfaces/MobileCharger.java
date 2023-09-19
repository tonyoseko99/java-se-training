package com.systechafrica.part2.interfaces;

public class MobileCharger implements ThreePinPlug {

    @Override
    public void plugIn() {
        System.out.println("Charger plugged in");
        
    }

    @Override
    public void plugOut() {
        System.out.println("Charger plugged out");
        
    }
    
}
