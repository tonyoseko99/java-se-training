package com.systechafrica.part2.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        ThreePinPlug laptopCharger = new LaptopCharger();
        laptopCharger.plugIn();
        laptopCharger.plugOut();
        
        ThreePinPlug mobileCharger = new MobileCharger();
        mobileCharger.plugIn();
        mobileCharger.plugOut();

        CalculateArea square = new Square();
        System.out.println("Area of square: " + square.calculateArea(5, 5));

        CalculatePerimeter squarePerimeter = new Square();
        System.out.println("Perimeter of square: " + squarePerimeter.calculatePerimeter(5, 5));

    }
}
