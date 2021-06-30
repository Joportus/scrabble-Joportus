package cl.uchile.dcc.scrabble.gui.operations;
import cl.uchile.dcc.scrabble.gui.Soperations.*;
import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.*;
import cl.uchile.dcc.scrabble.gui.Soperations.logic.LOr;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Divide;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Minus;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Multiply;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;
import cl.uchile.dcc.scrabble.gui.Soperations.transformations.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class treeNodeTest {
    private int i = 1005;
    private int i2 = 500;
    private int i3 = 106;
    private String b_1 = "1101010";
    private String b_2 = "0101101";
    private double fl = 1000;
    private binary binry1 = new binary(b_1);
    private binary binry2 = new binary(b_2);
    private Random rng;
    private int seed;
    private int strSize;
    private String first_random_binary_value;
    private String second_random_binary_value;
    private char[] ZeroOne = {'0','1'};
    private Strings st;
    private Strings st2;
    private boolean T = true;
    private boolean F = false;
    private Booleans b;
    private Booleans f;
    private int strSize2;
    private String first_random_string;
    private String second_random_string;

    @BeforeEach
    void setUp(){
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20) + 1;
        first_random_binary_value = RandomStringUtils.random(strSize, ZeroOne);
        second_random_binary_value = RandomStringUtils.random(strSize, ZeroOne);
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


    @RepeatedTest(100)
    void eval() {
        int first_random = rng.nextInt();
        int second_random = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        double random_between_0_1_2 = new Random().nextDouble();
        double second_double_random = second_random * random_between_0_1_2;
        integers I = new integers(first_random);
        integers I2 = new integers(second_random);
        floats F = new floats(first_double_random);
        floats F2 = new floats(second_double_random);
        binary bin1 = new binary(first_random_binary_value);
        binary bin2 = new binary(second_random_binary_value);

        Itypes expectedResult = I.sum(I2);
        Itypes actualResult = new SAdd(I, I2).eval();

        assertEquals(expectedResult, actualResult);

        integers I3 = new integers(i2);
        Itypes expectedResult2 = new binary("01111101000");
        treeNode actualResultT2 = new toBinary(new SAdd(I3, I3));
        Itypes actualResult2 = actualResultT2.eval();
        assertEquals(actualResult2, expectedResult2);

        Itypes expectedResult3 = (I.substract(I2)).transform_to_binary();
        treeNode actualResultT3 = new toBinary(new Minus(I, I2));
        Itypes actualResult3 = actualResultT3.eval();
        assertEquals(expectedResult3, actualResult3);

        assertNull(new toBooleans(I3).eval());

        assertEquals(f.eval(), f);

        Itypes expectedResult4 = I.transform_to_float();
        Itypes actualResult4 = new toFloats(I).eval();
        assertEquals(expectedResult4, actualResult4);

        Itypes expectedResult5 = bin1.transform_to_integers();
        Itypes actualResult5 = new toIntegers(bin1).eval();
        assertEquals(expectedResult5, actualResult5);

        Itypes expectedResult6 = I.transform_to_string();
        Itypes actualResult6 = new toStrings(I).eval();
        assertEquals(expectedResult6, actualResult6);

       treeNode example = new SAdd(
                new LOr(
                        new binary("1000"),
                        new toBinary(new Minus(
                                new integers(25),
                                new binary("0101")
                        ))
                ),
                new integers(7)
        );

        Itypes expectedExampleResult = new binary("011");

        assertEquals(example.eval(), expectedExampleResult);

        Itypes expectedResult7 = (I.multiply(I2)).multiply(I2.divide(I));
        Itypes actualResult7 = new Multiply(new Multiply(I, I2),new Divide(I2, I)).eval();

        assertEquals(expectedResult7, actualResult7);





    }

    @RepeatedTest(100)
    void add() {
        int first_random = rng.nextInt();
        int second_random = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        double random_between_0_1_2 = new Random().nextDouble();
        double second_double_random = second_random * random_between_0_1_2;
        integers I = new integers(first_random);
        integers I2 = new integers(second_random);
        floats F = new floats(first_double_random);
        floats F2 = new floats(second_double_random);
        binary bin1 = new binary(first_random_binary_value);
        binary bin2 = new binary(second_random_binary_value);

        treeNode a1 = new SAdd(new SAdd(I, I2), new SAdd(F, I));
        Itypes actualResult = a1.eval();
        double expectedResultValue = (I.getInt_value() + I2.getInt_value()) + (F.getFloat_value() + I.getInt_value());
        floats expectedResult = new floats(expectedResultValue);
        assertEquals(actualResult, expectedResult);
        assertEquals(actualResult, expectedResult);



    }
    @RepeatedTest(100)
    void lor(){


        Itypes expectedResult = b.or(f);
        Itypes actualResult = new LOr(b, f).eval();

        assertEquals(actualResult, expectedResult);

    }
    @RepeatedTest(100)
    void minus(){

        int first_random = rng.nextInt();
        int second_random = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        double random_between_0_1_2 = new Random().nextDouble();
        double second_double_random = second_random * random_between_0_1_2;
        integers I = new integers(first_random);
        integers I2 = new integers(second_random);
        floats F = new floats(first_double_random);
        floats F2 = new floats(second_double_random);
        binary bin1 = new binary(first_random_binary_value);
        binary bin2 = new binary(second_random_binary_value);

        treeNode a1 = new Minus(new Minus(I, I2), new Minus(F, I));
        Itypes actualResult = a1.eval();
        double expectedResultValue = (I.getInt_value() - I2.getInt_value()) - (F.getFloat_value() - I.getInt_value());
        floats expectedResult = new floats(expectedResultValue);

        assertEquals(actualResult, expectedResult);


    }
    @RepeatedTest(10)
    void constructorTest(){

        int first_random = rng.nextInt();
        int second_random = rng.nextInt();
        integers c1 = new integers(first_random);
        integers c2 = new integers(second_random);
        var expectedSAdd = new SAdd(c1, c2);
        var unexpectedSAdd = new SAdd(c1, c1);
        SAdd a = new SAdd(c1, c2);
        assertEquals(a, expectedSAdd);
        assertNotEquals(a, unexpectedSAdd);

        var expectedMinus = new Minus(c1, c2);
        var unexpectedMinus = new Minus(c1, c1);
        Minus a2 = new Minus(c1, c2);
        assertEquals(a2, expectedMinus);
        assertNotEquals(a2, unexpectedMinus);

        var expectedLOr = new LOr(b, f);
        var unexpectedLOr = new LOr(f, f);
        LOr a3 = new LOr(b, f);
        assertEquals(a3, expectedLOr);
        assertNotEquals(a3, unexpectedLOr);

    }

}