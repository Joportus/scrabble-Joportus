package cl.uchile.dcc.scrabble.gui;

public interface Binary_Int {
    /**
     * Returns a Scrabble integers representation of this object.
     */
    integers transform_to_integers();
    /**
     * Returns a Scrabble binary representation of this object.
     */
    binary transform_to_binary();
    /**
     * Receives a Scrabble binary and returns the Binary_Int result of the
     * sum of this scrabble's integer plus this Binary_Int.
     */
    Binary_Int sum_a_binary(binary B);
    /**
     * Receives a Scrabble binary and returns the Binary_Int result of the
     * multiplication of this scrabble's integer and this Binary_Int.
     */
    Binary_Int multiply_to_binary(binary B);
    /**
     * Receives a Scrabble binary and returns the Binary_Int result of this
     * Binary_Int divided by the Scrabble binary input.
     */
    Binary_Int divide_a_binary(binary B);
    /**
     * Receives a Scrabble binary and returns the Binary_Int result of this
     * Binary_Int minus the Scrabble binary input.
     */
    Binary_Int substract_to_binary(binary B);
}
