package com.systechafrica.OOP.AccessModifiers;

public class Student {
    String name;
    boolean contract;
    double salary;

    public Student() {
        this.name = "John";
        this.contract = true;
        this.salary = 1000.00;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.contract);
        System.out.println(student.salary);
    }
}
