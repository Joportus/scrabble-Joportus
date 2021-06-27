package cl.uchile.dcc.scrabble.gui;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SLogicalTest {

    private boolean t = true;
    private boolean f = false;
    private Booleans T;
    private Booleans F;
    private String b0 = "0";
    private String b11 = "111";
    private String b1 = "11111010101110";
    private String b2 = "000101001101";
    private String b1_2 = "11111010101110";
    private String b2_2 = "00000000101001101";
    private String b3 = "0000001100";
    private String b4 = "1111101111";
    private String b5 = "0101010001";
    private binary bin0;
    private binary bin1;
    private binary bin11;
    private binary bin12;
    private binary bin2;
    private binary bin22;
    private binary bin3;
    private binary bin4;
    private binary bin5;
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        T = new Booleans(t);
        F = new Booleans(f);
        bin0 = new binary(b0);
        bin11 = new binary(b11);
        bin12 = new binary(b1_2);
        bin1 = new binary(b1);
        bin2 = new binary(b2);
        bin22 = new binary(b2_2);
        bin3 = new binary(b3);
        bin4 = new binary(b4);
        bin5 = new binary(b5);
        seed = new Random().nextInt();
        rng = new Random(seed);
    }

    @Test
    void and() {
        Booleans expectedResult = new Booleans(true);
        Booleans actualResult = (Booleans) T.and(T);
        assertEquals(actualResult, expectedResult);

        Booleans expectedResult2 = new Booleans(false);
        Booleans actualResult2 = (Booleans) T.and(F);
        assertEquals(actualResult2, expectedResult2);

        Booleans actualResult3 = (Booleans) F.and(T);
        assertEquals(actualResult2, actualResult3);

        binary expectedResult4 = bin3;
        Itypes actualResult4 = bin1.and(bin2);
        assertEquals(expectedResult4, actualResult4);


        binary expectedResult4_2 = bin3;
        Itypes actualResult4_2 = bin12.and(bin22);
        assertEquals(expectedResult4_2, actualResult4_2);

        binary expectedResult4_3 = bin3;
        Itypes actualResult4_3 = bin2.and(bin1);
        assertEquals(expectedResult4, actualResult4);


        binary expectedResult4_4 = bin3;
        Itypes actualResult4_4 = bin22.and(bin12);
        assertEquals(expectedResult4_2, actualResult4_2);
        assertEquals(expectedResult4_3, actualResult4_3);
        assertEquals(expectedResult4_4, actualResult4_4);

        binary expectedResult5 = bin1;
        binary actualResult5 = (binary) bin1.and(T);
        assertEquals(expectedResult5, actualResult5);
        binary actualResult5_2 = (binary) T.and(bin1);
        assertEquals(actualResult5, actualResult5_2);

        binary expectedResult6 = bin0;
        binary actualResult6 = (binary) bin1.and(F);
        assertEquals(expectedResult6, actualResult6);
        binary actualResult6_2 = (binary) F.and(bin1);
        assertEquals(actualResult6_2, actualResult6);

        Itypes invalidResult = T.sum(F);
        assertNull(invalidResult);

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
        Itypes invalidResult2 = I.and(F);
        assertNull(invalidResult2);
        Itypes invalidResult3 = T.and(F);
        assertNull(invalidResult3);
        Itypes invalidResult4 = bin1.and(F);
        assertNull(invalidResult4);


    }
    @Test
    void or() {
        Booleans expectedResult = new Booleans(true);
        Booleans actualResult = (Booleans) T.or(T);
        assertEquals(actualResult, expectedResult);

        Booleans expectedResult2 = new Booleans(true);
        Booleans actualResult2 = (Booleans) T.or(F);
        assertEquals(actualResult2, expectedResult2);

        Booleans actualResult3 = (Booleans) F.or(T);
        assertEquals(actualResult2, actualResult3);

        binary expectedResult4 = bin4;
        Itypes actualResult4 = bin1.or(bin2);
        assertEquals(expectedResult4, actualResult4);

        binary expectedResult4_2 = bin4;
        Itypes actualResult4_2 = bin12.or(bin22);
        assertEquals(expectedResult4_2, actualResult4_2);

        binary expectedResult4_3 = bin4;
        Itypes actualResult4_3 = bin2.or(bin1);
        assertEquals(expectedResult4_3, actualResult4_3);

        binary expectedResult4_4 = bin4;
        Itypes actualResult4_4 = bin22.or(bin12);
        assertEquals(expectedResult4_4, actualResult4_4);

        binary expectedResult5 = bin11;
        binary actualResult5 = (binary) bin1.or(T);
        assertEquals(expectedResult5, actualResult5);
        binary actualResult5_2 = (binary) T.or(bin1);
        assertEquals(actualResult5, actualResult5_2);

        binary expectedResult6 = bin1;
        binary actualResult6 = (binary) bin1.or(F);
        assertEquals(expectedResult6, actualResult6);
        binary actualResult6_2 = (binary) F.or(bin1);
        assertEquals(actualResult6_2, actualResult6);

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
        Itypes invalidResult2 = I.or(F);
        assertNull(invalidResult2);
        Itypes invalidResult3 = T.or(F);
        assertNull(invalidResult3);
        Itypes invalidResult4 = bin1.or(F);
        assertNull(invalidResult4);



    }
    @Test
    void negate(){
        binary expectedResult = bin5;
        binary actualResult = bin1.negate();
        assertEquals(expectedResult, actualResult);
    }
}