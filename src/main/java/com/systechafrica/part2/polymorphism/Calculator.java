package com.systechafrica.part2.polymorphism;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // add method that takes 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // add method that takes 3 doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.0, 2.0));
        System.out.println(calculator.add(1, 2, 3));
        System.out.println(calculator.add(1.0, 2.0, 3.0));
    }
}
