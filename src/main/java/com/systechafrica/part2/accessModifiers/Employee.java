package com.systechafrica.part2.accessModifiers;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
        this.name = "John Doe";
        this.contract = false;
        this.salary = 1000.00;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1.name + " || " + employee1.contract + " || " + employee1.salary);
    }

}
