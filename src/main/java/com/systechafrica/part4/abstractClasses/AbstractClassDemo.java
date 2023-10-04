package com.systechafrica.part4.abstractClasses;

    /* 
     * Abstract classes are classes that cannot be instantiated, they are used as base classes for other classes
     * Abstract classes can have abstract methods and concrete methods
     * it's impossible to create an instance of an abstract class;
     * an abstract class can contain abstract methods that must be implemented in non-abstract subclasses;
     * it can contain fields and non-abstract methods (including static);
     * an abstract class can extend another class, including an abstract one;
     * it can contain a constructor.
     * 
     * STATIC METHODS CANNOT BE ABSTRACT
     * 
     */

public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        Cat cat = new Cat("Tom", 2);
        dog.say();
        cat.say();
    }
    
}
