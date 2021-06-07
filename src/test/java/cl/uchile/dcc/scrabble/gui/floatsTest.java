package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class floatsTest {
    private floats f;
    private floats f2;
    private integers I;
    private String s;
    double number = 10.5;
    int number2 = 10;

    @BeforeEach
    void setUp(){
        f = new floats(number);
        f2 = new floats(number);
        I = new integers(number2);

    }

    @Test
    void constructorTest(){
        var expectedFloat = new floats(10.5);
        assertEquals(expectedFloat.hashCode(), f.hashCode());
        assertEquals(expectedFloat, f);

        var differentFloat = new floats(10.4);
        assertNotEquals(differentFloat, f, "Float values should be different");

        assertNotEquals(f, I);

    }

    @Test
    void testToString() {
        s = String.valueOf(number);
        assertEquals(s, f.toString());
    }

    @Test
    void transform_to_float() {
        assertEquals(f, f.transform_to_float());
    }

/**
    @Test
    void getFloat_value() {
    }

    @Test
    void testToString() {
    }

    @Test
    void transform_to_float() {
    }
    **/
}