package com.systechafrica.posReviewed.login;

import java.sql.Connection;

public interface LoginInterface {
    boolean authenticate(Connection connection);
}
