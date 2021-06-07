package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class integersTest {
    private int i = 1005;
    private double fl = 1005;
    private int i2 = 1200;
    private String s = String.valueOf(i);
    private integers I;
    private integers I2;
    private floats F;
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        I = new integers(i);
        I2 = new integers(i2);
        F = new floats(fl);
        seed = new Random().nextInt();
        rng = new Random(seed);
    }
    @Test
    void constructorTest(){
        var expectedInt = new integers(i);
        assertEquals(expectedInt, I);
        assertEquals(expectedInt.hashCode(), I.hashCode());
        assertEquals(I2.hashCode(), expectedInt.hashCode());
    }

    @Test
    void transform_to_integers() {
        assertEquals(I, I.transform_to_integers());
    }

    @Test
    void testToString() {
        assertEquals(s, I.toString());
    }


    @RepeatedTest(25)
    void getInt_value() {
        int random_integer = rng.nextInt(50000);
        integers random_Integers = new integers(random_integer);
        assert random_integer == random_Integers.getInt_value();

    }

/**
    @Test
    void getInt_value() {
    }

    @Test
    void testToString() {
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
    **/
}