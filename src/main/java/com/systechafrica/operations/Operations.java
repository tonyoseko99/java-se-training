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

    private void assignmentOperators() {
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

    private void comparisonOperators() {

        // equal to
        int a = 10, b = 20;
        if (a == b) {
            LOGGER.info("a is equal to b");
        } else {
            LOGGER.info("a is not equal to b");
        }

        // not equal to
        if (a != b) {
            LOGGER.info("a is not equal to b");
        } else {
            LOGGER.info("a is equal to b");
        }

        // greater than
        if (a > b) {
            LOGGER.info("a is greater than b");
        } else {
            LOGGER.info("a is not greater than b");
        }

        // less than
        if (a < b) {
            LOGGER.info("a is less than b");
        } else {
            LOGGER.info("a is not less than b");
        }

        // greater than or equal to
        if (a >= b) {
            LOGGER.info("a is greater than or equal to b");
        } else {
            LOGGER.info("a is not greater than or equal to b");
        }

        // less than or equal to
        if (a <= b) {
            LOGGER.info("a is less than or equal to b");
        } else {
            LOGGER.info("a is not less than or equal to b");
        }
    }

    private void logicalOperators() {
        int a = 10, b = 20, c = 30;

        // logical AND
        if (a > b && a > c) {
            LOGGER.info("a is the largest number");
        } else if (b > a && b > c) {
            LOGGER.info("b is the largest number");
        } else if (c > a && c > b) {
            LOGGER.info("c is the largest number");
        }

        // logical OR
        if (a > b || a > c) {
            LOGGER.info("a is the largest number");
        } else if (b > a || b > c) {
            LOGGER.info("b is the largest number");
        } else if (c > a || c > b) {
            LOGGER.info("c is the largest number");
        }

        // logical NOT
        if (!(a > b)) {
            LOGGER.info("a is not greater than b");
        } else {
            LOGGER.info("a is greater than b");
        }
    }

    public static void main(String[] args) {
        Operations app = new Operations();
        app.arithmeticOperator();
        app.assignmentOperators();
        app.comparisonOperators();
        app.logicalOperators();

    }
}
