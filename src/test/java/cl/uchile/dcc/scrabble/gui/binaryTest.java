package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binaryTest {

    private String b1 = "011001";
    private String b2 = "101110";
    private binary bin1;

    @BeforeEach
    void setUp(){
        bin1 = new binary(b1);

    }
    @Test
    void constructorTest() {
        var expectedBinary = new binary(b1);
        var unexpectedBinary = new binary(b2);
        assertEquals(expectedBinary, bin1);
        assertNotEquals(unexpectedBinary, bin1);
        assertEquals(expectedBinary.hashCode(), bin1.hashCode());
        assertEquals(unexpectedBinary.hashCode(), bin1.hashCode());

    }

    @Test
    void transform_to_binary() {
    assertEquals(bin1, bin1.transform_to_binary());
    }

    @Test
    void testToString() {
        assertEquals(b1, bin1.toString());

    }

    /**
    @Test
    void getBinary_value() {
    }

    @Test
    void testToString() {
    }

    @Test
    void transform_to_binary() {
    }
    **/
}