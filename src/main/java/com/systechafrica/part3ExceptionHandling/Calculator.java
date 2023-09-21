package com.systechafrica.part3ExceptionHandling;

public class Calculator {
    public double add (double a, double b) {
        return a + b;
    }

    public double divide (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // throws ArithmeticException
                                                                    // and terminates the program
        }
        return a / b;
    }

    // handle the exception
    public double divide2 (double a, double b) {
        return a / b;
    }

    // connect the calculator to the db and handle the exception using jdbc
}
