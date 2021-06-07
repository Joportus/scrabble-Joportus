package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class StringsTest {

    private Strings st;
    private Strings st2;
    private boolean T = true;
    private boolean F = false;
    private Booleans b;
    private Booleans f;
    private Random rng;
    private int seed;
    private int strSize;
    private int strSize2;
    private String first_random_string;
    private String second_random_string;
    private String first_random_binary_value;
    private char[] ZeroOne = {'0','1'};


    @BeforeEach
    void setUp(){
        st = new Strings("hello");
        st2 = new Strings("goodbye");
        b = new Booleans(T);
        f = new Booleans(F);
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20) + 1;
        strSize2 = rng.nextInt(20);
        first_random_binary_value = RandomStringUtils.random(strSize, ZeroOne); strSize = rng.nextInt(20);
        first_random_string = RandomStringUtils.random(strSize2, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        second_random_string = RandomStringUtils.random(strSize2, 0, Character.MAX_CODE_POINT, true, false, null, rng);


    }
    @Test
    void constructorTest(){
        var expectedString = new Strings("hello");
        assertEquals(expectedString.hashCode(), st.hashCode());
        assertEquals(expectedString, st);
        assertNotEquals(expectedString, st2);
        assertNotEquals(st, b);

    }
    @Test
    void testToString() {
        String st_content = "hello";
        String str_content = st.toString();
        assertEquals(str_content, st_content);

    }
    @RepeatedTest(100)
    void transform_to_string(){
        int first_random = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        integers I = new integers(first_random);
        floats F = new floats(first_double_random);
        binary bin1 = new binary(first_random_binary_value);
        Strings s1 = new Strings(first_random_string);
        Strings s2 = new Strings(second_random_string);

        String expectedResult_value = I.toString();
        Strings expectedResult = new Strings(expectedResult_value);
        Strings actualResult = I.transform_to_string();
        assertEquals(expectedResult, actualResult);

        String expectedResult_value2 = F.toString();
        Strings expectedResult2 = new Strings(expectedResult_value2);
        Strings actualResult2 = F.transform_to_string();
        assertEquals(expectedResult2, actualResult2);

        String expectedResult_value3 = bin1.toString();
        Strings expectedResult3 = new Strings(expectedResult_value3);
        Strings actualResult3 = bin1.transform_to_string();
        assertEquals(expectedResult3, actualResult3);

        String expectedResult_value4 = b.toString();
        Strings expectedResult4 = new Strings(expectedResult_value4);
        Strings actualResult4 = b.transform_to_string();
        assertEquals(expectedResult4, actualResult4);

        String expectedResult_value5 = f.toString();
        Strings expectedResult5 = new Strings(expectedResult_value5);
        Strings actualResult5 = f.transform_to_string();
        assertEquals(expectedResult5, actualResult5);

        String expectedResult_value6 = s1.getString_value();
        Strings expectedResult6 = new Strings(expectedResult_value6);
        Strings actualResult6 = s1.transform_to_string();
        assertEquals(expectedResult6, actualResult6);



    }
    @RepeatedTest(100)
    void sum_to_string(){
        int first_random = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        integers I = new integers(first_random);
        floats F = new floats(first_double_random);
        binary bin1 = new binary(first_random_binary_value);
        Strings s1 = new Strings(first_random_string);
        Strings s2 = new Strings(second_random_string);

        String expectedResult_value = s1.getString_value() + I.toString();
        Strings expectedResult = new Strings(expectedResult_value);
        Strings actualResult = s1.sum(I);
        assertEquals(expectedResult, actualResult);

        String expectedResult_value2 = s1.getString_value() + F.toString();
        Strings expectedResult2 = new Strings(expectedResult_value2);
        Strings actualResult2 = s1.sum(F);
        assertEquals(expectedResult2, actualResult2);

        String expectedResult_value3 = s1.getString_value() + bin1.toString();
        Strings expectedResult3 = new Strings(expectedResult_value3);
        Strings actualResult3 = s1.sum(bin1);
        assertEquals(expectedResult3, actualResult3);

        String expectedResult_value4 = s1.getString_value() + b.toString();
        Strings expectedResult4 = new Strings(expectedResult_value4);
        Strings actualResult4 = s1.sum(b);
        assertEquals(expectedResult4, actualResult4);

        String expectedResult_value5 = s1.getString_value() + f.toString();
        Strings expectedResult5 = new Strings(expectedResult_value5);
        Strings actualResult5 = s1.sum(f);
        assertEquals(expectedResult5, actualResult5);

        String expectedResult_value6 = s1.getString_value() + s2.getString_value();
        Strings expectedResult6 = new Strings(expectedResult_value6);
        Strings actualResult6 = s1.sum(s2);
        assertEquals(expectedResult6, actualResult6);


    }

}

/**
    @Test
    void getString_value() {
    }

  **/