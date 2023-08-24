package com.systechafrica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {
    App app = new App();

    @Test
    public void add() {
        // when
        int result = app.add(1, 2);
        // then
        int expected = 3;
        // verify
        Assertions.assertEquals(expected, result, "1 + 2 should be 3");

    }

    @Test
    public void testReturnOneToFive() {
        App app = new App();
        assertEquals(5, app.returnOneToFive(true));
        assertEquals(1, app.returnOneToFive(false));
    }

    @Test
    void checkType() {
        App app = new App();

        // Test String
        Object obj1 = "Hello";
        app.checkType(obj1);

        // Test Integer
        Object obj2 = 10;
        app.checkType(obj2);

        // Test Double
        Object obj3 = 10.5;
        app.checkType(obj3);

        // Test Float
        Object obj4 = 10.5f;
        app.checkType(obj4);

        // Test Boolean
        Object obj5 = true;
        app.checkType(obj5);

        // Test Character
        Object obj6 = 'a';
        app.checkType(obj6);

        // Test Long
        Object obj7 = 100000000000L;
        app.checkType(obj7);

        // Test Byte
        Object obj8 = (byte) 10;
        app.checkType(obj8);

        // Test Short
        Object obj9 = (short) 10;
        app.checkType(obj9);

        // Test Other
        Object obj10 = new Object();
        app.checkType(obj10);
    }

}
