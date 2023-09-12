package com.systechafrica.part2.inheritance;

import java.util.logging.Logger;

public class InheritanceDemo extends Object {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();

        LOGGER.info("app => " + app.hashCode());
        LOGGER.info("app => " + app.toString());
        LOGGER.info("app => " + app.getClass().getPackageName());
    }
}
