package com.systechafrica.part2.inheritance;

import java.util.logging.Logger;

import com.systechafrica.part2.inheritance.companySetup.SoftwareEngineer;

public class InheritanceDemo extends Object {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();
        app.companySetup();
    }

    public void companySetup() {
        SoftwareEngineer e1 = new SoftwareEngineer();
        e1.setName("Tonny");
        e1.setAddress("Nairobi");
        e1.setEmployeeNumber("1234");
        LOGGER.info("Software Eng => " + e1.toString());
    }
}
