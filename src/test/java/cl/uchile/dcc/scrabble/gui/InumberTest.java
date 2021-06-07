package cl.uchile.dcc.scrabble.gui;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class InumberTest {
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


    @BeforeEach
    void setUp(){

        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20) + 1;
        first_random_binary_value = RandomStringUtils.random(strSize, ZeroOne);
        second_random_binary_value = RandomStringUtils.random(strSize, ZeroOne);


    }
    @RepeatedTest(100)
    void substract() {
        int first_random = rng.nextInt();
        int second_random = rng.nextInt();
        integers I = new integers(first_random);
        integers I2 = new integers(second_random);
        integers expectedResult = new integers(first_random-first_random);
        integers actualResult = (integers) I.substract(I);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult.hashCode(), actualResult.hashCode());

        integers expectedResult2 = new integers(first_random-second_random);
        integers actualResult2 = (integers) I.substract(I2);
        assertEquals(expectedResult2, actualResult2);

        integers expectedResult3 = new integers(second_random-first_random);
        integers actualResult3 = (integers) I2.substract(I);
        assertEquals(expectedResult3, actualResult3);

        assertNotEquals(actualResult2, actualResult3);

        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        double random_between_0_1_2 = new Random().nextDouble();
        double second_double_random = second_random * random_between_0_1_2;

        floats F = new floats(first_double_random);
        floats expectedResult4 = new floats(first_double_random - first_random);
        floats actualResult4 = (floats) F.substract(I);
        assertEquals(expectedResult4, actualResult4);

        floats expectedResult5 = new floats(first_random - first_double_random);
        floats actualResult5 = (floats) I.substract(F);
        assertEquals(expectedResult5, actualResult5);

        assertNotEquals(actualResult5, actualResult4);

        floats expectedResult6 = new floats(first_double_random - first_double_random);
        floats actualResult6 = (floats) F.substract(F);
        assertEquals(expectedResult6, actualResult6);

        binary bin1 = new binary(first_random_binary_value);
        binary bin2 = new binary(second_random_binary_value);

        int result7 = bin1.transform_to_integers().getInt_value() - bin2.transform_to_integers().getInt_value();
        binary expectedResult7 = new integers(result7).transform_to_binary();
        Binary_Int actualResult7 = bin1.substract(bin2);
        assertEquals(expectedResult7, actualResult7);


        Binary_Int actualResult8 = bin2.substract(bin1);
        assertEquals(actualResult7.transform_to_integers().getInt_value(), - actualResult8.transform_to_integers().getInt_value());

        int expectedResult_value9 = I.getInt_value() - bin1.transform_to_integers().getInt_value();
        integers expectedResult9 = new integers(expectedResult_value9);
        integers actualResult9 = (integers) I.substract(bin1);
        assertEquals(expectedResult9, actualResult9);

        double expectedResult_value10 = F.getFloat_value() - bin1.transform_to_float().getFloat_value();
        floats expectedResult10 = new floats(expectedResult_value10);
        floats actualResult10 = (floats) F.substract(bin1);
        assertEquals(expectedResult10, actualResult10);

        int expectedResult_value11 =  bin1.transform_to_integers().getInt_value() - I.getInt_value();
        integers expectedResult11_i = new integers(expectedResult_value11);
        binary expectedResult11 = expectedResult11_i.transform_to_binary();
        binary actualResult11 = (binary) bin1.substract(I);
        assertEquals(expectedResult11, actualResult11);





    }
    @RepeatedTest(100)
    void multiply(){
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

        integers expectedResult = new integers(first_random * first_random);
        integers actualResult = (integers) I.multiply(I);
        assertEquals(expectedResult, actualResult);

        floats expectedResult2 = new floats(first_double_random * first_random);
        floats actualResult2 = (floats) F.multiply(I);
        assertEquals(expectedResult2, actualResult2);

        floats expectedResult3 = new floats(first_random * first_double_random);
        floats actualResult3 = (floats) I.multiply(F);
        assertEquals(expectedResult3, actualResult3);

        floats expectedResult4 = new floats(first_double_random * first_double_random);
        floats actualResult4 = (floats) F.multiply(F);
        assertEquals(expectedResult4, actualResult4);

        int result7 = bin1.transform_to_integers().getInt_value() * bin2.transform_to_integers().getInt_value();
        binary expectedResult7 = new integers(result7).transform_to_binary();
        Binary_Int actualResult7 = bin1.multiply(bin2);
        assertEquals(expectedResult7, actualResult7);

        Binary_Int actualResult7_2 = bin2.multiply(bin1);
        assertEquals(actualResult7, actualResult7_2);

        int expectedResult_value8 = I.getInt_value() * bin1.transform_to_integers().getInt_value();
        integers expectedResult8 = new integers(expectedResult_value8);
        integers actualResult8 = (integers) I.multiply(bin1);
        assertEquals(expectedResult8, actualResult8);

        double expectedResult_value9 = F.getFloat_value() * bin1.transform_to_float().getFloat_value();
        floats expectedResult9 = new floats(expectedResult_value9);
        floats actualResult9 = (floats) F.multiply(bin1);
        assertEquals(expectedResult9, actualResult9);

        int expectedResult_value10 =  bin1.transform_to_integers().getInt_value() * I.getInt_value();
        integers expectedResult10_i = new integers(expectedResult_value10);
        binary expectedResult10 = expectedResult10_i.transform_to_binary();
        binary actualResult10 = (binary) bin1.multiply(I);
        assertEquals(expectedResult10, actualResult10);



    }
    @RepeatedTest(100)
    void divide(){
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
        binary bin1 = new binary(first_random_binary_value + "1");
        binary bin2 = new binary(second_random_binary_value + "1");

        integers expectedResult = new integers(first_random/first_random);
        integers actualResult = (integers) I.divide(I);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult.hashCode(), actualResult.hashCode());

        integers expectedResult2 = new integers(first_random/second_random);
        integers actualResult2 = (integers) I.divide(I2);
        assertEquals(expectedResult2, actualResult2);

        integers expectedResult3 = new integers(second_random/first_random);
        integers actualResult3 = (integers) I2.divide(I);
        assertEquals(expectedResult3, actualResult3);

        assertNotEquals(actualResult2, actualResult3);

        floats expectedResult4 = new floats(first_double_random/first_random);
        floats actualResult4 = (floats) F.divide(I);
        assertEquals(expectedResult4, actualResult4);

        floats expectedResult5 = new floats(first_random/first_double_random);
        floats actualResult5 = (floats) I.divide(F);
        assertEquals(expectedResult5, actualResult5);

        assertNotEquals(actualResult5, actualResult4);

        floats expectedResult6 = new floats(first_double_random/first_double_random);
        floats actualResult6 = (floats) F.divide(F);
        assertEquals(expectedResult6, actualResult6);
        int result7 = bin1.transform_to_integers().getInt_value() / bin2.transform_to_integers().getInt_value();

        binary expectedResult7 = new integers(result7).transform_to_binary();
        Binary_Int actualResult7 = bin1.divide(bin2);
        assertEquals(expectedResult7, actualResult7);

        int expectedResult_value8 = I.getInt_value() / bin1.transform_to_integers().getInt_value();
        integers expectedResult8 = new integers(expectedResult_value8);
        integers actualResult8 = (integers) I.divide(bin1);
        assertEquals(expectedResult8, actualResult8);

        double expectedResult_value9 = F.getFloat_value() / bin1.transform_to_float().getFloat_value();
        floats expectedResult9 = new floats(expectedResult_value9);
        floats actualResult9 = (floats) F.divide(bin1);
        assertEquals(expectedResult9, actualResult9);

        int expectedResult_value10 =  bin1.transform_to_integers().getInt_value() / I.getInt_value();
        integers expectedResult10_i = new integers(expectedResult_value10);
        binary expectedResult10 = expectedResult10_i.transform_to_binary();
        binary actualResult10 = (binary) bin1.divide(I);
        assertEquals(expectedResult10, actualResult10);





    }

    @RepeatedTest(100)
    void sum(){
        int first_random = rng.nextInt();
        integers I = new integers(first_random);
        binary bin1 = new binary(first_random_binary_value);
        double random_between_0_1 = new Random().nextDouble();
        double first_double_random = first_random * random_between_0_1;
        floats F = new floats(first_double_random);
        integers number1 = binry1.transform_to_integers();
        integers number2 = binry2.transform_to_integers();

        int result_int = number1.getInt_value() + number2.getInt_value();
        integers result_integers = new integers(result_int);
        binary expectedResult = result_integers.transform_to_binary();
        binary actualResult = (binary) binry1.sum(binry2);
        assertEquals(expectedResult, actualResult);

        int result_value = bin1.transform_to_integers().getInt_value() + I.getInt_value();
        integers expectedResult2 = new integers(result_value);
        integers actualResult2 = (integers) I.sum(bin1);
        assertEquals(expectedResult2, actualResult2);


        int expectedResult_value3 =  bin1.transform_to_integers().getInt_value() + I.getInt_value();
        integers expectedResult3_i = new integers(expectedResult_value3);
        binary expectedResult3 = expectedResult3_i.transform_to_binary();
        binary actualResult3 = (binary) bin1.sum(I);
        assertEquals(expectedResult3, actualResult3);

        double expectedResult_value4 = F.getFloat_value() + bin1.transform_to_float().getFloat_value();
        floats expectedResult4 = new floats(expectedResult_value4);
        floats actualResult4 = (floats) F.sum(bin1);
        assertEquals(expectedResult4, actualResult4);



    }

}