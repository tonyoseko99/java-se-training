package com.systechafrica.ControlFlow;

import java.util.logging.Logger;

public class ControlFlow {
    private static final Logger LOGGER = Logger.getLogger(ControlFlow.class.getName());

    private void controlStatements() {
        int a = 10, b = 20, c = 30;

        // if statement
        if (a > b) {
            LOGGER.info("a is greater than b");
        } else {
            LOGGER.info("a is not greater than b");
        }

        // if-else-if statement
        if (a > b) {
            LOGGER.info("a is greater than b");
        } else if (b > c) {
            LOGGER.info("b is greater than c");
        } else {
            LOGGER.info("c is greater than a and b");
        }

        // switch statement
        switch (a) {
            case 10:
                LOGGER.info("a is 10");
                break;
            case 20:
                LOGGER.info("a is 20");
                break;
            case 30:
                LOGGER.info("a is 30");
                break;
            default:
                LOGGER.info("a is not 10, 20 or 30");
        }

        // while loop
        while (a < 20) {
            LOGGER.info("a is " + a);
            a++;
        }

        // do-while loop
        do {
            LOGGER.info("a is " + a);
            a++;
        } while (a < 20);

        // for loop
        for (int i = 0; i < 10; i++) {
            LOGGER.info("i is " + i);
        }

        // for-each loop
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int number : numbers) {
            LOGGER.info("number is " + number);
        }

        // break statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            LOGGER.info("i is " + i);
        }

        // continue statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            LOGGER.info("i is " + i);
        }

        // return statement
        int result = add(1, 2);
        LOGGER.info("result is " + result);
    }

    private int add(int i, int j) {
        return 0;
    }

    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        app.controlStatements();
    }
}
