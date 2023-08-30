package com.systechafrica.Strings;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Strings {
    private static final Logger LOGGER = Logger.getLogger(Strings.class.getName());

    private void stringOperations() {
        // initialize a string
        String str = "Hello World";
        LOGGER.info(str);

        // get the length of a string
        int length = str.length();
        LOGGER.info("The length of the string is " + length);

        // get the character at a given index
        char charAt = str.charAt(0);
        LOGGER.info("The character at index 0 is " + charAt);

        // get the index of a given character
        int indexOf = str.indexOf('o');
        LOGGER.info("The index of the character 'o' is " + indexOf);

        // get the index of a given character starting from a given index
        int indexOfFromIndex = str.indexOf('o', 5);
        LOGGER.info("The index of the character 'o' starting from index 5 is " + indexOfFromIndex);

        // string concatenation
        String concat = str.concat("!");
        LOGGER.info(concat);

        // string comparison
        boolean equals = str.equals("Hello World");
        LOGGER.info("The string is equal to 'Hello World': " + equals);

        // string comparison ignoring case
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello world");
        LOGGER.info("The string is equal to 'hello world': " + equalsIgnoreCase);

        // string comparison using compareTo
        int compareTo = str.compareTo("Hello World");
        LOGGER.info("The string is equal to 'Hello World': " + (compareTo == 0));

        // string comparison using compareToIgnoreCase
        int compareToIgnoreCase = str.compareToIgnoreCase("hello world");
        LOGGER.info("The string is equal to 'hello world': " + (compareToIgnoreCase == 0));

        // string comparison using regionMatches
        boolean regionMatches = str.regionMatches(0, "Hello", 0, 5);
        LOGGER.info("The string starts with 'Hello': " + regionMatches);

        // accepting user input using JOptionPane
        String input = JOptionPane.showInputDialog("Enter your name: ");
        LOGGER.info("Your name is " + input);

    }

    private void builders() {
        StringBuilder builder = new StringBuilder("Hello World!");
        builder.replace(6, 11, "Java");
        LOGGER.info(builder.toString());
    }

    private void stringOps(){
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        LOGGER.info(ta);

    }

    public static void main(String[] args) {
        Strings app = new Strings();
        // app.stringOperations();
        // app.builders();
        app.stringOps();
    }
}
