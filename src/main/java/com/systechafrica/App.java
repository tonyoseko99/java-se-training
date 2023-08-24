package com.systechafrica;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    // method that returns 1 to 5 if a condition is true
    public int returnOneToFive(boolean condition) {
        if (condition) {
            return 5;
        } else {
            return 1;
        }
    }
}
