package com.systechafrica.part2.staticMethodsAndClasses;

public class StaticMethodsdemo {
    public static void main(String[] args) {
        // access the add method from the calculator class
        int sum = MathUtils.Calculator.add(5,10 );
        System.out.println("Sum: " + sum);

    }
}
