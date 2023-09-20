package com.systechafrica.part2.interfaces.booksstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.UUID;

public class BookControllerImpl implements BookController{
    
    private static final Logger LOGGER = Logger.getLogger(BookControllerImpl.class.getName());
    List<Book> books = new ArrayList<>();

    // generate ID for book as UUID
    private String generateId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public Book createBook(Book book) {
        book.setId(generateId());
        books.add(book);
        LOGGER.info("Book created successfully");
        return book;
    }

    @Override
    public Optional<Book> findBook(String isbn) {
       for (Book book : books) {
           if (book.getIsbn().equals(isbn)) {
               LOGGER.info("Book found");
               return Optional.of(book);
           }
       }
       return Optional.empty();
    }

    @Override
    public Book updateBook(String isbn, String title) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setTitle(title);
                LOGGER.info("Book updated successfully");
                return book;
            }
        }
        return null;
    }

    @Override
    public void deleteBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                LOGGER.info("Book deleted successfully");
            }
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    
}
