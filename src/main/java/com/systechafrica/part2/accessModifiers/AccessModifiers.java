package com.systechafrica.part2.accessModifiers;

public class AccessModifiers {

    public static void main(String[] args) {
        Person person1 = new Person("John", 23); // Accessible because it is public class in Person.java file in
                                                 // accessModifiers package
        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAge(0);
        person2.isMale();
        person1.printPersonalDetails(); // John || 23 Accessible because it is public method in Person class
        person2.printPersonalDetails(); // Jane || 0 Accessible because it is public method in Person class

    }
}
