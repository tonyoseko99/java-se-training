package com.systechafrica.part3.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.posReviewed.customFormatter.CustomFormatter;


public class DatabaseAccessDemo {
    private static final Logger LOGGER = Logger.getLogger(DatabaseAccessDemo.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {

        try {
            FileHandler fileHandler = new FileHandler("db-log.txt");
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);
            LOGGER.info("This is a database log message");

            // load the db driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection to the database
            String connectionUrl = "jdbc:mysql://localhost:3308/javase";
            String user = "user";
            String password = "password";
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);

            // create a statement from the connection
            Statement statement = connection.createStatement();



        } 
        
        catch (ClassNotFoundException e){
            LOGGER.severe("Error loading the database driver" + e.getMessage());
        }
        catch (IOException e) {
            LOGGER.severe("Cannot READ / WRITE the database" + e.getMessage());
        } catch (SQLException e) {
            LOGGER.severe("Error connecting to the database" + e.getMessage());
        } 
    }

}
