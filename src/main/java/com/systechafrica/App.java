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

    public int returnOneToFive(boolean condition) {
        if (condition) {
            return 5;
        } else {
            return 1;
        }
    }

    public void checkType(Object obj) {
        if (obj instanceof String) {
            System.out.println("String");
        } else if (obj instanceof Integer) {
            System.out.println("Integer");
        } else if (obj instanceof Double) {
            System.out.println("Double");
        } else if (obj instanceof Float) {
            System.out.println("Float");
        } else if (obj instanceof Boolean) {
            System.out.println("Boolean");
        } else if (obj instanceof Character) {
            System.out.println("Character");
        } else if (obj instanceof Long) {
            System.out.println("Long");
        } else if (obj instanceof Byte) {
            System.out.println("Byte");
        } else if (obj instanceof Short) {
            System.out.println("Short");
        } else {
            System.out.println("Other");
        }
    }
}
