package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ItypesTest {
    private int i = 1005;
    private int i2 = 500;
    private double fl = 1005;
    private integers I;
    private integers I2;
    private integers I3;
    private floats F;
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        I = new integers(i);
        I2 = new integers(i);
        I3 = new integers(i2);
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
