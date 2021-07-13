package cl.uchile.dcc.scrabble.gui.Soperations.flowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.*;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.floatsFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.logic.LAnd;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Minus;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class IfTest {
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

        treeNode t1 = new Minus(new SAdd(integersFactory.createIntegers(5), integersFactory.createIntegers(2)),
                floatsFactory.createFloats(1.5));
        treeNode cond = new LAnd(booleansFactory.createBooleans(true), booleansFactory.createBooleans(false));

        treeNode cond2 = new LAnd(booleansFactory.createBooleans(true), booleansFactory.createBooleans(true));

        treeNode t2 = new Minus(new SAdd(integersFactory.createIntegers(10), integersFactory.createIntegers(-5))
                , floatsFactory.createFloats(6.2));

        Itypes actualResult = new If(cond, t1, t2).eval();
        Itypes expectedResult = t2.eval();
        assertEquals(actualResult, expectedResult);

        Itypes actualResult2 = new If(cond2, t1, t2).eval();
        Itypes expectedResult2 = t1.eval();
        assertEquals(expectedResult2, actualResult2);
    }
}