package com.systechafrica.part2.staticMethodsAndClasses;

public class StaticMethodsdemo {
    public static void main(String[] args) {
        // access the add method from the calculator class
        int sum = MathUtils.Calculator.add(5,10 );
        System.out.println("Sum: " + sum);

        // access the getArea method from the Area class
        double area = MathUtils.Area.getArea(7, 7);
        System.out.println("Area: " + area);

        // access the perimeter method from the Area class
        double perimeter = MathUtils.Area.perimeter(7, 7);
        System.out.println("Perimeter: " + perimeter);

    }
}
