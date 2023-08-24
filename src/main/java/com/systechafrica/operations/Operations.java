package com.systechafrica.operations;

import java.util.logging.Logger;

public class Operations {
    private static final Logger LOGGER = Logger.getLogger(Operations.class.getName());

    private void arithmeticOperator() {
        int studentOneAge = 22;
        int studentTwoAge = 23;

        // Addition
        int totalAge = studentOneAge + studentTwoAge;
        LOGGER.info("Total age is " + totalAge);

        // Subtraction
        int ageDifference = studentTwoAge - studentOneAge;
        LOGGER.info("Age difference is " + ageDifference);

        // Multiplication
        int product = studentOneAge * studentTwoAge;
        LOGGER.info("Product is " + product);

        // Division
        int quotient = studentTwoAge / studentOneAge;
        LOGGER.info("Quotient is " + quotient);

        
    }

    private void assignmentOperators (){
        // simple assignment
        int a = 10;

        // chained assignment
        int b, c, d;

        // compound assignment
        int e = 10;
        e += 5;

        // multiple assignment
        int f = 10, g = 20, h = 30;

        // mixed assignment
        int i = 10, j = 20, k = 30;
    }
    
    private void comparisonOperators (){
        
    }
    public static void main(String[] args) {
        Operations app = new Operations();
        app.arithmeticOperator();
        app.assignmentOperators();
        app.comparisonOperators();
    }
}
