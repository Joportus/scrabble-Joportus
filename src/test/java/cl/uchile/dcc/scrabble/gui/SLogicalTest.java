package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SLogicalTest {

    private boolean t = true;
    private boolean f = false;
    private Booleans T;
    private Booleans F;

    @BeforeEach
    void setUp(){
        T = new Booleans(t);
        F = new Booleans(f);
    }

    @Test
    void and() {
        Booleans expectedResult = new Booleans(true);
        Booleans actualResult = (Booleans) T.and(T);
        assertEquals(actualResult, expectedResult);

        Booleans expectedResult2 = new Booleans(false);
        Booleans actualResult2 = (Booleans) T.and(F);
        assertEquals(actualResult2, expectedResult2);

        Booleans actualResult3 = (Booleans) F.and(T);
        assertEquals(actualResult2, actualResult3);

    }
    @Test
    void or() {
        Booleans expectedResult = new Booleans(true);
        Booleans actualResult = (Booleans) T.or(T);
        assertEquals(actualResult, expectedResult);

        Booleans expectedResult2 = new Booleans(true);
        Booleans actualResult2 = (Booleans) T.or(F);
        assertEquals(actualResult2, expectedResult2);

        Booleans actualResult3 = (Booleans) F.or(T);
        assertEquals(actualResult2, actualResult3);

    }
}