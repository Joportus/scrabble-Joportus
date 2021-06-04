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
    private String b1 = "1010101110";
    private String b2 = "0101001101";
    private String b3 = "0000001100";
    private String b4 = "1111101111";
    private String b5 = "0101010001";
    private binary bin1;
    private binary bin2;
    private binary bin3;
    private binary bin4;
    private binary bin5;

    @BeforeEach
    void setUp(){
        T = new Booleans(t);
        F = new Booleans(f);
        bin1 = new binary(b1);
        bin2 = new binary(b2);
        bin3 = new binary(b3);
        bin4 = new binary(b4);
        bin5 = new binary(b5);
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

        binary expectedResult4 = bin3;
        SLogical actualResult4 = bin1.and(bin2);
        assertEquals(expectedResult4, actualResult4);

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

        binary expectedResult4 = bin4;
        SLogical actualResult4 = bin1.or(bin2);
        assertEquals(expectedResult4, actualResult4);


    }
    @Test
    void negate(){
        binary expectedResult = bin5;
        binary actualResult = bin1.negate();
        assertEquals(expectedResult, actualResult);
    }
}