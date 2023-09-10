package com.systechafrica.part2.accessModifiers;

public class Person {
    private String name;
    private int age;
    private boolean isMale;

    // setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "John Doe";
        this.age = 0;
    }

    public void printPersonalDetails() {
        System.out.println(getPersonalDetails());
    }

    public String getPersonalDetails() {
        return name + " || " + age + " || " + isMale;
    }
}
