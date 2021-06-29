package cl.uchile.dcc.scrabble.gui.operations;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
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
    void setUp() {
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
    @RepeatedTest(10)
    void constructorTest(){
        int first_random = rng.nextInt();
        int second_random = rng.nextInt();
        Constant c1 = new Constant(new integers(first_random));
        Constant c2 = new Constant(new integers(second_random));
        var expectedAdd = new Add(c1, c2);
        var unexpectedAdd = new Add(c1, c1);
        Add a = new Add(c1, c2);
        assertEquals(a, expectedAdd);
        assertNotEquals(a, unexpectedAdd);
    }

}