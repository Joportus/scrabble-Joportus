package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class binaryTest {

    private int i0 = 0;
    private int i1 = -1;
    private int i = 1005;
    private int i2 = 500;
    private int i3 = 484;
    private int i4 = 56699;
    private String s = "hello";
    private Strings S;
    private double fl = 1005;
    private String b0 = "0";
    private String b11 = "0111100100";
    private String bn = "011001";
    private String bn2 = "000011001";
    private String nb = "11010110";
    private String nb2 = "11111010110";
    private String b_1 = "1";
    private String b4 = "01101110101111011";
    private binary bin0;
    private binary bin1;
    private binary bin11;
    private binary bin_1;
    private binary bin_nb;
    private binary bin_nb_2;
    private binary bin_bn;
    private binary bin_bn_2;
    private binary bin_3;
    private integers I0;
    private integers I1;
    private integers I;
    private integers I2;
    private integers I3;
    private integers I4;
    private floats F;
    private Random rng;
    private int seed;
    private int strSize;
    private String first_random_binary_value;
    private String second_random_binary_value;
    private char[] ZeroOne = {'0','1'};

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
        bin_1 = new binary(b_1);
        bin11 = new binary(b11);
        bin_nb = new binary(nb);
        bin_nb_2 = new binary(nb2);
        bin_bn = new binary(bn);
        bin_bn_2 = new binary(bn2);
        bin_3 = new binary(b4);
        seed = new Random().nextInt();
        rng = new Random(seed);
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20) + 1;
        first_random_binary_value = RandomStringUtils.random(strSize, ZeroOne);
        second_random_binary_value = RandomStringUtils.random(strSize, ZeroOne);

    }

    @RepeatedTest(100)
    void constructorTest() {
        var expectedBinary = new binary(first_random_binary_value);
        var unexpectedBinary = new binary(second_random_binary_value);
        bin1 = new binary(first_random_binary_value);
        assertEquals(expectedBinary, bin1);
        assertEquals(expectedBinary.hashCode(), bin1.hashCode());
        assertEquals(unexpectedBinary.hashCode(), bin1.hashCode());
        assertEquals(bin_nb, bin_nb_2);
        assertEquals(bin_bn, bin_bn_2);
        assertEquals(bin_nb_2, bin_nb);
        assertEquals(bin_bn_2, bin_bn);
        assertNotEquals(bn, nb);
        assertNotEquals(bin1, I);



    }

    @Test
    void transform_to_binary() {
        bin1 = new binary(first_random_binary_value);
        assertEquals(bin1, bin1.transform_to_binary());
        Strings s = new Strings(first_random_binary_value);
        assertNull(s.transform_to_binary());
    }

    @Test
    void testToString() {
        bin1 = new binary(first_random_binary_value);
        assertEquals(bin1.getBinary_value(), bin1.toString());

    }
    @Test
    void transform_to_integers(){


        integers expectedResult = new integers(i3);
        integers actualResult = bin11.transform_to_integers();
        assertEquals(expectedResult, actualResult);

        integers expectedResult2 = new integers(0);
        integers actualResult2 = bin0.transform_to_integers();
        assertEquals(expectedResult2, actualResult2);

        integers expectedResult3 = new integers(i4);
        integers actualResult3 = bin_3.transform_to_integers();
        assertEquals(expectedResult3, actualResult3);
        System.out.println(actualResult3);
        System.out.println(expectedResult3);
        binary eq1 = new binary("1");
        binary eq2 = new binary("11");
        assertEquals(eq1, eq2);
        assertEquals(eq1.transform_to_integers(), eq2.transform_to_integers());


    }
    @Test
    void transform_to_float(){
        integers expectedResult_int = new integers(i3);
        floats expectedResult = expectedResult_int.transform_to_float();
        floats actualResult = bin11.transform_to_float();
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

    @Test
    void getBinary_value() {
        bin1 = new binary(first_random_binary_value);
        assert bin1.getBinary_value().equals(first_random_binary_value);
    }

}