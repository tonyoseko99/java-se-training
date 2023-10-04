package com.systechafrica.part4.abstractClasses;

public class Dog extends Pet{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }
}
