package com.systechafrica.part2.classes;

public class Car {
    private String name;
    private String model;
    private String color;
    private int year;

    public Car(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving " + name + " " + model);
    }

    public void stop() {
        System.out.println("Stopping " + name + " " + model);
    }

    public void park() {
        System.out.println("Parking " + name + " " + model);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "Red", 2019);
        car.drive();
        car.stop();
        car.park();

    }

}
