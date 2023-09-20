package com.systechafrica.part2.interfaces.booksstore;

public class Book {
    private String id;
    private String isbn;
    private String title;
    private String author;

    public Book( String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String string) {
        this.id = string;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}
