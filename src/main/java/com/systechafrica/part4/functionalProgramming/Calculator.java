package com.systechafrica.part4.functionalProgramming;

@FunctionalInterface
public interface Calculator {
    /*
    * functional interfaces only have one abstract method
    * if they must include other methods, they must be default or static
    * */
    int calculate(int a, int b); // abstract method

    default void print(){
        System.out.println("This is a default method");
    } // default method

    static void printStatic(){
        System.out.println("This is a static method");
    } // static method
}
