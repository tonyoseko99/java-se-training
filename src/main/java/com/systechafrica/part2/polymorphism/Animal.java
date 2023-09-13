package com.systechafrica.part2.polymorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        animal.eat();
    }
}
