package com.systechafrica.part3ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.divide(2, 3));
        // System.out.println(calculator.divide(2, 0)); // throws ArithmeticException
        //                                                 // and terminates the program
        System.out.println(calculator.divide2(2, 0 ));
    }
}
