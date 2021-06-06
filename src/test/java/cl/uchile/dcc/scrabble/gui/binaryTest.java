package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class binaryTest {

    private int i0 = 0;
    private int i1 = -1;
    private int i = 1005;
    private int i2 = 500;
    private int i3 = 484;
    private String s = "hello";
    private Strings S;
    private double fl = 1005;
    private String b0 = "0";
    private String b1 = "0111100100";
    private String b2 = "01100100";
    private String b_1 = "1";
    private binary bin0;
    private binary bin1;
    private binary bin_1;
    private integers I0;
    private integers I1;
    private integers I;
    private integers I2;
    private integers I3;
    private integers I4;
    private floats F;
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        I0 = new integers(i0);
        I = new integers(i);
        I1 = new integers(i1);
        I2 = new integers(i);
        I3 = new integers(i2);
        I4 = new  integers(i3);
        S = new Strings("hello");
        F = new floats(fl);
        bin0 = new binary (b0);
        bin1 = new binary(b1);
        bin_1 = new binary(b_1);
        seed = new Random().nextInt();
        rng = new Random(seed);

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
    @Test
    void transform_to_integers(){
        integers expectedResult = new integers(i3);
        integers actualResult = bin1.transform_to_integers();
        assertEquals(expectedResult, actualResult);

        integers expectedResult2 = new integers(0);
        integers actualResult2 = bin0.transform_to_integers();
        assertEquals(expectedResult2, actualResult2);

        integers actualResult3 = bin_1.transform_to_integers();
        System.out.println(actualResult3);

        binary eq1 = new binary("1");
        binary eq2 = new binary("11");
        assertEquals(eq1, eq2);
        assertEquals(eq1.transform_to_integers(), eq2.transform_to_integers());


    }
    @Test
    void transform_to_float(){
        integers expectedResult_int = new integers(i3);
        floats expectedResult = expectedResult_int.transform_to_float();
        floats actualResult = bin1.transform_to_float();
        assertEquals(expectedResult, actualResult);

        integers expectedResult2_int = new integers(0);
        floats expectedResult2 = expectedResult2_int.transform_to_float();
        floats actualResult2 = bin0.transform_to_float();
        assertEquals(expectedResult2, actualResult2);

        integers actualResult3 = bin_1.transform_to_integers();
        System.out.println(actualResult3);

        binary eq1 = new binary("1");
        binary eq2 = new binary("11");
        assertEquals(eq1, eq2);
        assertEquals(eq1.transform_to_float(), eq2.transform_to_float());

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