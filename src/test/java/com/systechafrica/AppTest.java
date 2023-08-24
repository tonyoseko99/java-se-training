package com.systechafrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
