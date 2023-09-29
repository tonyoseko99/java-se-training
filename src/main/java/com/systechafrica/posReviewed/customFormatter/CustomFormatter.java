package com.systechafrica.posReviewed.customFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateTime = dateTimeFormatter.format(localDateTime);

        String method = record.getSourceMethodName();
        String level = record.getLevel().getName();
        String message = record.getMessage();
        return dateTime + " | " + method + " | " + level + " | " + message + "\n";
    }
}