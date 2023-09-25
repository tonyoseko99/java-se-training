package com.systechafrica.part3ExceptionHandling;

public class StudentDetailsMissingException extends Exception {
    public StudentDetailsMissingException(String message) {
        super(message);
    }
}
