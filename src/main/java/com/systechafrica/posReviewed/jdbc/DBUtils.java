package com.systechafrica.posReviewed.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.posReviewed.customFormatter.CustomFormatter;


public class DBUtils {
    private static final Logger LOGGER = Logger.getLogger(DBUtils.class.getName());
    
    private static String connectionUrl = "jdbc:mysql://localhost:3308/javase";
    private static String user = "user";
    private static String password = "password";
    public static Connection connection;

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("db-log.txt");
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);
            LOGGER.info("Message");

            // load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(connectionUrl, user, password);

            // create a statement object to send to the database
            Statement statement = connection.createStatement();

            // DROP table ITEMS
            dropTable(statement);

            // create a table items
            createTable(statement);

            // create a table orders
            createTableOrders(statement);

            // create a table users
            createTableUsers(statement);

            // insert a default password for the admin, Admin123
            insertDefaultPassword(statement);

        } catch (ClassNotFoundException e) {
            LOGGER.severe("Error loading the database driver" + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Cannot READ / WRITE the database" + e.getMessage());
        } catch (SQLException e) {
            LOGGER.severe("Error connecting to the database" + e.getMessage());
        } finally {
            closeDatabaseResources();
        }
    }

    private static void dropTable(Statement statement) throws SQLException {
        String dropTableSql = "DROP TABLE IF EXISTS ITEMS";
        statement.executeUpdate(dropTableSql);
    }

    private static void createTable(Statement statement) throws SQLException {
        String createTableSql = "CREATE TABLE IF NOT EXISTS items ("
                + "ID INT NOT NULL AUTO_INCREMENT,"
                + "CODE VARCHAR(20) NOT NULL,"
                + "NAME VARCHAR(255) NOT NULL,"
                + "QUANTITY INT NOT NULL,"
                + "PRICE DOUBLE NOT NULL,"
                + "PRIMARY KEY (ID)"
                + ")";
        statement.executeUpdate(createTableSql);
        LOGGER.info("Items table created successfully...");
    }

    private static void createTableOrders(Statement statement) throws SQLException {
        try {
            String createTableSql = "CREATE TABLE IF NOT EXISTS orders ("
                + "ID INT NOT NULL AUTO_INCREMENT,"
                + "ITEM_ID INT NOT NULL,"
                + "TOTAL_DUE DOUBLE NOT NULL,"
                + "PRIMARY KEY (ID),"
                + "FOREIGN KEY (ITEM_ID) REFERENCES items(ID)"
                + ")";
        statement.executeUpdate(createTableSql);
        LOGGER.info("Orders table created successfully...");
        } catch (Exception e) {
            LOGGER.severe("Error creating the orders table: " + e.getMessage());
        }
    }

    // create a users table with a default password for the admin, Admin123
    private static void createTableUsers(Statement statement) throws SQLException {
        String createTableSql = "CREATE TABLE IF NOT EXISTS users ("
                + "ID INT NOT NULL AUTO_INCREMENT,"
                + "PASSWORD VARCHAR(255) NOT NULL DEFAULT 'Admin123',"
                + "PRIMARY KEY (ID)"
                + ")";
        statement.executeUpdate(createTableSql);
        LOGGER.info("Users table created successfully...");
    }

    // insert a default password for the admin, Admin123
    private static void insertDefaultPassword(Statement statement) throws SQLException {
        String insertSql = "INSERT INTO users (PASSWORD) VALUES ('Admin123')";
        statement.executeUpdate(insertSql);
        LOGGER.info("Default password inserted successfully...");
    }

    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(connectionUrl, user, password);
                LOGGER.info("Connected to the Database...");
            }
            return connection;
        } catch (Exception e) {
            LOGGER.severe("Error getting the database connection: " + e.getMessage());
            return null;
        }
    }
    
    private static void closeDatabaseResources() {
        if (connection != null) {
            try {
                connection.close();
                LOGGER.info("Database connection closed...");
            } catch (SQLException e) {
                LOGGER.severe("Error closing the database connection: " + e.getMessage());
            }
        }
    }

}
