package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BooleansTest {
    private boolean T = true;
    private boolean F = false;
    private Booleans b;
    private Booleans f;

    @BeforeEach
    void setUp(){
        b = new Booleans(T);
        f = new Booleans(F);


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

    @Test
    void negate(){
        Booleans expectedResult = new Booleans(false);
        Booleans actualResult = b.negate();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void to_string(){
        /**
        String expectedResult = "true";
        String actualResult = b.toString();
        String expectedResult2 = "false";
        String actualResult2 = f.toString();
        **/
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