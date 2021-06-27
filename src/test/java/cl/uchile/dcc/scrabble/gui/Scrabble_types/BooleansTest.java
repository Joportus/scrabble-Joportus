package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.*;

import static org.junit.jupiter.api.Assertions.*;

class BooleansTest {
    private boolean T = true;
    private boolean F = false;
    private Booleans b;
    private Booleans f;
    private int i = 10;
    private integers I;


    @BeforeEach
    void setUp(){
        b = new Booleans(T);
        f = new Booleans(F);
        I = new integers(i);


    }
    @Test
    void constructorTest() {
        var expectedBool = new Booleans(true);
        var unexpectedBool = new Booleans(false);
        assertEquals(expectedBool, b);
        assertNotEquals(unexpectedBool, b);
        assertEquals(expectedBool.hashCode(), b.hashCode());
        assertEquals(unexpectedBool.hashCode(), b.hashCode());
        assertNotEquals(b, I);

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

        String expectedResult = "true";
        String actualResult = b.toString();
        String expectedResult2 = "false";
        String actualResult2 = f.toString();
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult2, actualResult2);
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