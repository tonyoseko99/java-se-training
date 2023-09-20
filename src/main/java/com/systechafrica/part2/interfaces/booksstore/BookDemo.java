package com.systechafrica.part2.interfaces.booksstore;

public class BookDemo {
    public static void main(String[] args) {
        BookControllerImpl books = new BookControllerImpl();
        Book b1 = new Book("1234", "The Alchemist", "Paulo Coelho");
        Book b2 = new Book("5678", "The Pilgrimage", "Paulo Coelho");
        Book b3 = new Book("91011", "The Fifth Mountain", "Paulo Coelho");
        Book b4 = new Book("121314", "The Devil and Miss Prym", "Paulo Coelho");
        Book b5 = new Book("151617", "Eleven Minutes", "Paulo Coelho");

        books.createBook(b1);
        books.createBook(b2);
        books.createBook(b3);
        books.createBook(b4);
        books.createBook(b5);

        books.printBooks();

        books.updateBook("1234", "The Alchemist: A Fable About Following Your Dream");
        books.printBooks();

        books.deleteBook("5678");
        books.printBooks();

        books.findBook("91011");
    }
}
