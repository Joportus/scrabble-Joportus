package cl.uchile.dcc.scrabble.gui;

public interface Binary_Int {
    integers transform_to_integers();
    binary transform_to_binary();
    Binary_Int sum_a_binary(binary B);
    Binary_Int multiply_to_binary(binary B);
    Binary_Int divide_a_binary(binary B);
    Binary_Int substract_to_binary(binary B);
}
