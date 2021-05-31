package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ItypesTest {
    private int i = 1005;
    private double fl = 1005;
    private integers I;
    private floats F;
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        I = new integers(i);
        F = new floats(fl);
        seed = new Random().nextInt();
        rng = new Random(seed);
    }
    @Test
    void transform_to_float() {
        floats expectedResult = new floats(fl);
        floats actualResult = I.transform_to_float();
        assert expectedResult.getFloat_value() == actualResult.getFloat_value();
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
