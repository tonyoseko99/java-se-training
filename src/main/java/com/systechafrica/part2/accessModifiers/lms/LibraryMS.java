package com.systechafrica.part2.accessModifiers.lms;

public class LibraryMS {
    public static void main(String[] args) {
        Book book = new Book();
        book.isbn = "1234567890";
        book.title = "Java for Beginners";
        book.printBookDetails(); // ISBN: 1234567890 || Title: Java for Beginners
    }
}
