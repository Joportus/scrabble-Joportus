package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringsTest {

    private Strings st;
    @BeforeEach
    void setUp(){
        st = new Strings("hello");
    }
    @Test
    void constructorTest(){
        var expectedString = new Strings("hello");
        assertEquals(expectedString.hashCode(), st.hashCode());
    }

/**
    @Test
    void getString_value() {
    }

    @Test
    void testToString() {
    }
    **/
}