package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ItypesTest {
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
    private int strSize;
    private String first_random_string;
    private char[] ZeroOne = {'0','1'};
    private Booleans b = booleansFactory.createBooleans(true);
    private Booleans f = booleansFactory.createBooleans(false);

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
        strSize = rng.nextInt(20);
        first_random_string = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
    }
    @Test
    void transform_to_float() {
        floats expectedResult = new floats(fl);
        floats actualResult = (floats) I.transform_to_float();
        assert expectedResult.getFloat_value() == actualResult.getFloat_value();

    }


    @Test
    void sum() {
        integers expectedResult = new integers(i + i);
        Itypes actual_result = I.sum(I2);
        assertEquals(expectedResult, actual_result);
        assertEquals(expectedResult.hashCode(), actual_result.hashCode());
        floats expectedResult_2 = new floats(fl + fl);
        floats expectedResult_3 = new floats(fl + i);
        Itypes actual_result_2 = F.sum(F);
        Itypes actual_result_3 = I.sum(F);
        Itypes actual_result_3b = F.sum(I);
        Itypes different_result = I3.sum(F);

        assertEquals(expectedResult_2, actual_result_2);
        assertEquals(expectedResult_3, actual_result_3);
        assertEquals(actual_result_3, actual_result_3b);
        assertNotEquals(different_result, actual_result_3);

        Strings expectedResult4 =  new Strings("hello500");
        Itypes actualResult4 = S.sum(I3);
        assertEquals(expectedResult4, actualResult4);

    }
    @Test
    void transform_to_binary() {
        binary expectedResult = new binary(b1);
        binary actualResult = I4.transform_to_binary();
        assertEquals(expectedResult, actualResult);

        binary expectedResult2 = new binary("0");
        binary actualResult2 = I0.transform_to_binary();
        assertEquals(expectedResult2, actualResult2);

        binary actualResult3 = I1.transform_to_binary();

        System.out.println(actualResult3);


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
    void compareTo(){
        integers i1 = integersFactory.createIntegers(100);
        integers i2 = integersFactory.createIntegers(150);
        int actualResult1 = i1.compareTo(i2);
        int expectedResult1 = -1;
        assertEquals(expectedResult1, actualResult1);

        binary b1 = binaryFactory.createBinary("01111");
        integers i3 = integersFactory.createIntegers(14);
        int actualResult2 = b1.compareTo(i3);
        int expectedResult2 = 1;
        assertEquals(actualResult2, expectedResult2);

        int actualResult3 = i3.compareTo(b1);
        int expectedResult3 = -1;
        assertEquals(actualResult3, expectedResult3);

        floats f1 = floatsFactory.createFloats(14.9);
        int actualResult4 = f1.compareTo(b1);
        int expectedResult4 = -1;
        assertEquals(actualResult4, expectedResult4);

        floats f2 = floatsFactory.createFloats(15.1);
        int actualResult5 = f2.compareTo(b1);
        int expectedResult5 = 1;
        assertEquals(actualResult5, expectedResult5);

        floats f3 = floatsFactory.createFloats(14.9);

        assertEquals(f1.compareTo(f3), 0);

        binary b2 = binaryFactory.createBinary("011111");
        binary b3 = binaryFactory.createBinary("011111");
        assertEquals(b2.compareTo(b1), 1);
        assertEquals(b1.compareTo(b2), -1);
        assertEquals(b2.compareTo(b3), 0);

        assertEquals(b.compareTo(f), 1);
        assertEquals(f.compareTo(b), -1);

        Booleans b_1 = booleansFactory.createBooleans(true);
        assertEquals(b.compareTo(b_1), 0);

        //Invalid comparisons
        Strings s1 = stringsFactory.createStrings("hello");
        Strings s2 = stringsFactory.createStrings("dally");
        Strings s4 = stringsFactory.createStrings("yellow");
        Strings s5 = stringsFactory.createStrings("hello");

        NullType nullType = nullTypeFactory.createNull();
        assertEquals(b.compareTo(f1), -2);

        assertEquals(s1.compareTo(b), -2);

        assertEquals(I.compareTo(f), -2);

        assertEquals(b1.compareTo(s1), -2);

        assertEquals(f1.compareTo(b), -2);

        assertEquals(nullType.compareTo(b), -2);




        assertEquals(f2.compareTo(b1), 1);

        assertEquals(b1.compareTo(f2), -1);

        floats f4 = floatsFactory.createFloats(100.0);

        assertEquals(f4.compareTo(i1), 0);

        assertEquals(i1.compareTo(f4), 0);

        assertEquals(i1.compareTo(f3), 1);

        assertEquals(f3.compareTo(i1), -1);

        assertEquals(s1.compareTo(s5), 0);

        assertEquals(s1.compareTo(s2), 4);

        assertEquals(s1.compareTo(s4), -17);








    }


/**
    @Test
    void transform_to_string() {
    }

    @Test
    void transform_to_float() {
    }

    @Test
    void transform_to_integers() {
    }

    @Test
    void transform_to_binary() {
    }

    @Test
    void transform_to_boolean() {
    }
    **/

}
