package com.systechafrica.part4.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingDemo {
    public static void main(String[] args) {
        // lambda functions
        Runnable lambdaFunctions = () -> {
            List<Integer> integers = List.of(1, 2, 3, 4, 5);
            integers.forEach(integer -> System.out.println(integer));
        };
        lambdaFunctions.run(); 

        // functions
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.calculate(2, 3));
        calculator.print();
        Calculator.printStatic();
    }
}

