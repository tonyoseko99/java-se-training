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

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.arithmeticOperator();
    }
}
