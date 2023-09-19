package com.systechafrica.part2.constructors;

public class Book {
    String title;
    String isbn;
    boolean isAvailable;


    public Book(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.isAvailable = true;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    @Override
    public boolean equals(Object obj) {
        // check for non-null reference
        if (obj == null) {
            return false;
        }

        // assign obj to a variable of type Book
        Book b1 = (Book) obj;

        // check for equality of isbn
        if (this.isbn.equals(b1.isbn)) {
            return true;
        }

        return false;
    }

    
    
}
