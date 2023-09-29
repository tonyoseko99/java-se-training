package com.systechafrica.pos.login;

import java.sql.Connection;

public interface LoginInterface {
    boolean authenticate(Connection connection);
}
