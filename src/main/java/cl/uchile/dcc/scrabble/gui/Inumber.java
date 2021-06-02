package cl.uchile.dcc.scrabble.gui;

public interface Inumber{
    Inumber substract_to_Float(floats F);
    Inumber substract_to_binary(binary B);
    Inumber substract_to_integer(integers I);
    Inumber substract(Inumber inumber);
    Inumber multiply_to_Float(floats F);
    Inumber multiply_to_binary(binary B);
    Inumber multiply_to_integer(integers I);
    Inumber multiply(Inumber inumber);
    Inumber divide_a_Float(floats F);
    Inumber divide_a_binary(binary B);
    Inumber divide_a_integer(integers I);
    Inumber divide(Inumber inumber);


}
