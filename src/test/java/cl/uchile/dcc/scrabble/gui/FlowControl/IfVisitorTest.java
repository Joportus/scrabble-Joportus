package cl.uchile.dcc.scrabble.gui.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.*;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Divide;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Minus;
import cl.uchile.dcc.scrabble.gui.Soperations.math.Multiply;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static cl.uchile.dcc.scrabble.gui.FlowControl.IfVisitor.CIf;
import static org.junit.jupiter.api.Assertions.*;

class IfVisitorTest {
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

    @Test
    void Sif(){
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

        Booleans STrue = booleansFactory.createBooleans(true);

        Booleans SFalse = booleansFactory.createBooleans(false);

        Itypes tree1 = new Multiply(new Multiply(I, I2),new Multiply(I2, I)).eval();

        Itypes tree2 = new Multiply(new Minus(I, I2),new SAdd(I2, I)).eval();

        Itypes actualResult = CIf(STrue, tree1, tree2);

        assertEquals(tree1, actualResult);

        Itypes actualResult2 = CIf(SFalse, tree1, tree2);

        assertEquals(tree2, actualResult2);


    }
}