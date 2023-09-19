package com.systechafrica.part2.constructors;

public class ConstructorDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "978-0062315007", "Paulo Coelho");
        Book b2 = new Book("The Alchemist", "978-0062315007", "Paulo Coelho");
        if (b1.equals(b2)) {
            System.out.println("The books are equal");
            System.out.println(b1.hashCode());
            System.out.println(b2.hashCode());
        } else {
            System.out.println("The books are not equal");
        }
    }
}
