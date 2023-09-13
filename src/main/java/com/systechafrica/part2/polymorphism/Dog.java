package com.systechafrica.part2.polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.eat();
    }
}
