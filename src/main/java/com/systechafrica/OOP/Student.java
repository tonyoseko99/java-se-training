package com.systechafrica.OOP;

public class Student {
    String name;
    String gender;
    int age;

    // student name setter
    public void setName(String name) {
        this.name = name;
    }

    // student name getter
    public String getName() {
        return name;
    }

    // student name speaks()
    public void speak() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.speak();

    }
}
