package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringsTest {

    private Strings st;
    private Strings st2;
    @BeforeEach
    void setUp(){
        st = new Strings("hello");
        st2 = new Strings("goodbye");

    }
    @Test
    void constructorTest(){
        var expectedString = new Strings("hello");
        assertEquals(expectedString.hashCode(), st.hashCode());
        assertEquals(expectedString, st);
        assertNotEquals(expectedString, st2);

    }
    @Test
    void testToString() {
        String st_content = "hello";
        String str_content = st.toString();
        assertEquals(str_content, st_content);

    }

}

/**
    @Test
    void getString_value() {
    }

  **/