package com.systechafrica.part4.abstractClasses;

public class Cat extends Pet{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
    
}
