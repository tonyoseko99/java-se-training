package com.systechafrica.Strings;

import java.util.logging.Logger;

public class Strings {
    private static final Logger LOGGER = Logger.getLogger(Strings.class.getName());

    private void stringOperations() {
        // initialize a string
        String str = "Hello World";

        // get the length of a string
        int length = str.length();

        // get the character at a given index
        char charAt = str.charAt(0);

        // get the index of a given character
        int indexOf = str.indexOf('o');

        // get the index of a given character starting from a given index
        int indexOfFromIndex = str.indexOf('o', 5);

        // string concatenation
        String concat = str.concat("!");

        // string comparison
        boolean equals = str.equals("Hello World");

        // string comparison ignoring case
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello world");

        // string comparison using compareTo
        int compareTo = str.compareTo("Hello World");

        // string comparison using compareToIgnoreCase
        int compareToIgnoreCase = str.compareToIgnoreCase("hello world");

        // string comparison using regionMatches
        boolean regionMatches = str.regionMatches(0, "Hello", 0, 5);

    }

    public static void main(String[] args) {
        Strings app = new Strings();
        app.stringOperations();
    }
}
