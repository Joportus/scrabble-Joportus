package cl.uchile.dcc.scrabble.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class InumberTest {
    private int i = 1005;
    private int i2 = 500;
    private int i3 = 106;
    private String b1 = "1101010";
    private String b2 = "0101101";
    private double fl = 1000;
    private integers I;
    private integers I2;
    private integers I3;
    private binary bin1 = new binary(b1);
    private binary bin2 = new binary(b2);
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
    void substract() {
        integers expectedResult = new integers(i-i);
        integers actualResult = (integers) I.substract(I);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult.hashCode(), actualResult.hashCode());

        integers expectedResult2 = new integers(i-i2);
        integers actualResult2 = (integers) I.substract(I3);
        assertEquals(expectedResult2, actualResult2);

        integers expectedResult3 = new integers(i2-i);
        integers actualResult3 = (integers) I3.substract(I);
        assertEquals(expectedResult3, actualResult3);

        assertNotEquals(actualResult2, actualResult3);

        floats expectedResult4 = new floats(fl - i);
        floats actualResult4 = (floats) F.substract(I);
        assertEquals(expectedResult4, actualResult4);

        floats expectedResult5 = new floats(i - fl);
        floats actualResult5 = (floats) I.substract(F);
        assertEquals(expectedResult5, actualResult5);

        assertNotEquals(actualResult5, actualResult4);

        floats expectedResult6 = new floats(fl - fl);
        floats actualResult6 = (floats) F.substract(F);
        assertEquals(expectedResult6, actualResult6);

        int result7 = bin1.transform_to_integers().getInt_value() - bin2.transform_to_integers().getInt_value();
        binary expectedResult7 = new integers(result7).transform_to_binary();
        Binary_Int actualResult7 = bin1.substract(bin2);
        assertEquals(expectedResult7, actualResult7);


        Binary_Int actualResult8 = bin2.substract(bin1);
        assertNotEquals(actualResult7, actualResult8);







    }
    @Test
    void multiply(){
        integers expectedResult = new integers(i*i);
        integers actualResult = (integers) I.multiply(I);
        assertEquals(expectedResult, actualResult);

        floats expectedResult2 = new floats(fl * i);
        floats actualResult2 = (floats) F.multiply(I);
        assertEquals(expectedResult2, actualResult2);

        floats expectedResult3 = new floats(i * fl);
        floats actualResult3 = (floats) I.multiply(F);
        assertEquals(expectedResult3, actualResult3);

        floats expectedResult4 = new floats(fl * fl);
        floats actualResult4 = (floats) F.multiply(F);
        assertEquals(expectedResult4, actualResult4);

        int result7 = bin1.transform_to_integers().getInt_value() * bin2.transform_to_integers().getInt_value();
        binary expectedResult7 = new integers(result7).transform_to_binary();
        Binary_Int actualResult7 = bin1.multiply(bin2);
        assertEquals(expectedResult7, actualResult7);

        Binary_Int actualResult8 = bin2.multiply(bin1);
        assertEquals(actualResult7, actualResult8);


    }
    @Test
    void divide(){
        integers expectedResult = new integers(i/i);
        integers actualResult = (integers) I.divide(I);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult.hashCode(), actualResult.hashCode());

        integers expectedResult2 = new integers(i/i2);
        integers actualResult2 = (integers) I.divide(I3);
        assertEquals(expectedResult2, actualResult2);

        integers expectedResult3 = new integers(i2/i);
        integers actualResult3 = (integers) I3.divide(I);
        assertEquals(expectedResult3, actualResult3);

        assertNotEquals(actualResult2, actualResult3);

        floats expectedResult4 = new floats(fl/i);
        floats actualResult4 = (floats) F.divide(I);
        assertEquals(expectedResult4, actualResult4);

        floats expectedResult5 = new floats(i/fl);
        floats actualResult5 = (floats) I.divide(F);
        assertEquals(expectedResult5, actualResult5);

        assertNotEquals(actualResult5, actualResult4);

        floats expectedResult6 = new floats(fl/fl);
        floats actualResult6 = (floats) F.divide(F);
        assertEquals(expectedResult6, actualResult6);


    }
}