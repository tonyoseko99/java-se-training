package com.systechafrica.pos.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.pos.customFormatter.CustomFormatter;


public class Login implements LoginInterface {
    private static final Logger LOGGER = Logger.getLogger(Login.class.getName());
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    private int loginAttempts = 0;

    @Override
    public boolean authenticate(Connection connection) {
        Scanner scanner = new Scanner(System.in);

        try {
            LOGGER.addHandler(new FileHandler("db-log.txt", true));

        } catch (Exception e) {
            LOGGER.severe("Error initializing logger " + e.getMessage());
        }
        LOGGER.getHandlers()[0].setFormatter(new CustomFormatter());

        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            try {
                String query = "SELECT * FROM users WHERE password = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, password);

               ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                     System.out.println("Login successful.");
                     return true;
                } else {
                     System.out.println("Invalid password. Please try again.");
                     loginAttempts++;
                }

            } catch (Exception e) {
                LOGGER.severe("Error authenticating user " + e.getMessage());
            }
        }

        System.out.println("You have exceeded the number of login attempts. Access denied.");
        return false;
    }
}
