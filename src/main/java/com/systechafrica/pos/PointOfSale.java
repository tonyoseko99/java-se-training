package com.systechafrica.pos;

public class PointOfSale {
    public void login() {
        Login login = new Login();
        login.login();
    }

    public static void main(String[] args) {
        PointOfSale pos = new PointOfSale();
        pos.login();
    }
}
