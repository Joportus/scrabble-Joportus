package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BooleansTest {
    private boolean T = true;
    private boolean F = false;
    private Booleans b;

    @BeforeEach
    void setUp(){
        b = new Booleans(T);

    }
    @Test
    void constructorTest() {
        var expectedBool = new Booleans(true);
        var unexpectedBool = new Booleans(false);
        assertEquals(expectedBool, b);
        assertNotEquals(unexpectedBool, b);
        assertEquals(expectedBool.hashCode(), b.hashCode());
        assertEquals(unexpectedBool.hashCode(), b.hashCode());

    }
        @Test
        void transform_to_boolean() {
            assertEquals(b, b.transform_to_boolean());
        }


/**
    @Test
    void isBool_value() {
    }

    @Test
    void transform_to_boolean() {
    }
    **/
}