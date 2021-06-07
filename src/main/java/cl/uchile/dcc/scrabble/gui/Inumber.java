package cl.uchile.dcc.scrabble.gui;

public interface Inumber{
    /**
     * Receives a Scrabble float and returns the Inumber result of the
     * subtraction between the scrabble's float minus this Inumber.
     */
    Inumber substract_to_Float(floats F);
    /**
     * Receives a Scrabble integer and returns the Inumber result of the
     * subtraction between the scrabble's integer input minus this Inumber.
     */
    Inumber substract_to_integer(integers I);
    /**
     * Receives a Scrabble float and returns the Inumber result of the
     * multiplication of this Inumber and input Scrabble float.
     */
    Inumber multiply_to_Float(floats F);
    /**
     * Receives a Scrabble integer and returns the Inumber result of the
     * multiplication of this Inumber and input Scrabble integer.
     */
    Inumber multiply_to_integer(integers I);
    /**
     * Receives a Scrabble float as input and returns the Inumber result of the
     * the input scrabble's float divided by this Inumber.
     */
    Inumber divide_a_Float(floats F);
    /**
     * Receives a Scrabble integer as input and returns the Inumber result of the
     * the input scrabble's float divided by this Inumber.
     */
    Inumber divide_a_integer(integers I);
    /**
     * Receives a Scrabble integer and returns the Inumber result of the
     * sum of this Inumber plus the input Scrabble integer.
     */
    Inumber sum_to_int(integers I);
    /**
     * Receives a Scrabble float and returns the Inumber result of the
     * sum of this Inumber plus the input Scrabble float.
     */
    Inumber sum_to_float(floats F);
    /**
     * Returns a Scrabble floats representation of this object.
     */
    Inumber transform_to_float();


}
