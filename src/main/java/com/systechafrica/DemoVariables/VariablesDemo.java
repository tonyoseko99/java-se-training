package com.systechafrica.DemoVariables;

import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger LOGGER = Logger.getLogger(VariablesDemo.class.getName());

    public static void main(String[] args) {

        VariablesDemo variablesDemo = new VariablesDemo();
        variablesDemo.constantVariables();
        variablesDemo.integerTypes();
        variablesDemo.variableDeclarations();
        variablesDemo.floatingTypes();
        variablesDemo.booleanTypes();
        variablesDemo.characterTypes();

    }

    public void floatingTypes() {
        // float types
        float floatRate = 2.1457454F;
        double doubleRate = 2.1457454;

        LOGGER.info("Float Value: " + floatRate);
        LOGGER.info("Double Value: " + doubleRate);

    }

    public void constantVariables() {
        final double PI = 3.14159;
        LOGGER.info("Constant variable PI is: " + PI);

    }

    public void variableDeclarations() {
        int score = 0;
        LOGGER.info("Score integer variable value is: " + score);
    }

    public void integerTypes() {
        variableDeclarations();
        LOGGER.info("Integer Minimum: " + Integer.MIN_VALUE);
        LOGGER.info("Integer Maximum: " + Integer.MAX_VALUE);
    }

    public void characterTypes() {
        char grade = 'A';
        LOGGER.info("Character value " + grade);
    }

    public void booleanTypes() {
        boolean isPromoted = false;
        boolean isProcessed = true;
        LOGGER.info("False Value: " + isPromoted);
        LOGGER.info("True value: " + isProcessed);

    }

}