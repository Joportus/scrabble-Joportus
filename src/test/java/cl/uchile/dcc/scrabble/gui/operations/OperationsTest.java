package cl.uchile.dcc.scrabble.gui.operations;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
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

        Constant c1 = new Constant(I);
        Constant c2 = new Constant(I2);
        Itypes IexpectedResult = c1.getType().sum(c2.getType());
        Constant expectedResult = new Constant(IexpectedResult);
        Constant actualResult = c1.add(c2);

        assertEquals(expectedResult, actualResult);
        assertEquals(c1.eval(),c1);

        integers I3 = new integers(i2);
        Constant c3 = new Constant(I3);
        Constant expectedResult2 = new Constant(new binary("01111101000"));
        Constant actualResult2 = new Add(c3,c3).toBinary();
        assertEquals(actualResult2, expectedResult2);





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
        Operations c1 = new Constant(I);
        Operations c2 = new Constant(I2);
        Operations c3 = new Constant(F);
        Operations c4 = new Constant(I);
        Operations a1 = new Add(new Add(c1, c2), new Add(c3, c4));
        Constant actualResult = a1.eval();
        double expectedResultValue = (I.getInt_value() + I2.getInt_value()) + (F.getFloat_value() + I.getInt_value());
        floats expectedResultFloats = new floats(expectedResultValue);
        Constant expectedResult = new Constant(expectedResultFloats);
        assertEquals(actualResult, expectedResult);
        assertEquals(actualResult.getType(), expectedResultFloats);

        Add a2 = new Add(c2, c2);
        System.out.println(a2.eval().getType());


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

        Operations c1 = new Constant(I);
        Operations c2 = new Constant(I2);
        Operations c3 = new Constant(F);
        Operations c4 = new Constant(I);
        Operations a1 = new Minus(new Minus(c1, c2), new Minus(c3, c4));
        Constant actualResult = a1.eval();
        double expectedResultValue = (I.getInt_value() - I2.getInt_value()) - (F.getFloat_value() - I.getInt_value());
        floats expectedResultFloats = new floats(expectedResultValue);
        Constant expectedResult = new Constant(expectedResultFloats);
        assertEquals(actualResult, expectedResult);
        assertEquals(actualResult.getType(), expectedResultFloats);



    }

}