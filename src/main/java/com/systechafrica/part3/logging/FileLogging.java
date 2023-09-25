package com.systechafrica.part3.logging;

import java.io.IOException;
import java.util.logging.*;

public class FileLogging {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler = new FileHandler("log.txt");
        CustomFormatter formatter = new CustomFormatter();
        fileHandler.setFormatter(formatter);
        LOGGER.addHandler(fileHandler);
        LOGGER.info("This is a log message");
    }

    static class CustomFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            String method = record.getSourceMethodName();
            String level = record.getLevel().getName();
            String message = record.getMessage();
            return method + " | " + level + " | " + message + "\n";
        }
    }
}
