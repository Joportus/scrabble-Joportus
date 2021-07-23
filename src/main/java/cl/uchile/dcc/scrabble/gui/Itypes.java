package cl.uchile.dcc.scrabble.gui;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.*;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public interface Itypes extends treeNode {



  /**
   * Returns a Scrabble Strings object resulting from the input's String value
   * concatenated to this objects toString() representation.
   * @return
   */
  Itypes sum_to_string(Strings S);

  /**
   * Receives a Scrabble's Booleans as input and returns an SLogical representing
   * the result of a logical and operation between the Scrabble Booleans input and this SLogical.
   */
  Itypes bool_and(Booleans b);
  /**
   * Receives a Scrabble's binary as input and returns an SLogical representing
   * the result of a logical and operation between the Scrabble binary input and this SLogical.
   */
  Itypes binary_and(binary bin);

  /**
   * Receives a Scrabble's Booleans as input and returns an SLogical representing
   * the result of a logical or operation between the Scrabble Booleans input and this SLogical.
   */
  Itypes bool_or(Booleans b);
  /**
   * Receives a Scrabble's binary as input and returns an SLogical representing
   * the result of a logical or operation between the Scrabble binary input and this SLogical.
   */
  Itypes binary_or(binary bin);

  /**
   * Returns a Scrabble Strings representation of this object.
   */
  Itypes transform_to_string();

  /**
   * Returns a Scrabble integers representation of this object.
   */
  Itypes transform_to_integers();
  /**
   * Returns a Scrabble floats representation of this object.
   * @return
   */
  Itypes transform_to_float();
  /**
   * Returns a Scrabble binary representation of this object.
   */
  Itypes transform_to_binary();

  /**
   * Returns a Scrabble boolean representation of this object.
   */
  Itypes transform_to_boolean();
  /**
   * Receives a Scrabble binary and returns the Binary_Int result of the
   * sum of this scrabble's integer plus this Binary_Int.
   */
  Itypes sum_a_binary(binary B);
  /**
   * Receives a Scrabble binary and returns the Binary_Int result of the
   * multiplication of this scrabble's integer and this Binary_Int.
   */
  Itypes multiply_to_binary(binary B);
  /**
   * Receives a Scrabble binary and returns the Binary_Int result of this
   * Binary_Int divided by the Scrabble binary input.
   */
  Itypes divide_a_binary(binary B);
  /**
   * Receives a Scrabble binary and returns the Binary_Int result of this
   * Binary_Int minus the Scrabble binary input.
   */
  Itypes substract_to_binary(binary B);

  /**
   * Receives a Scrabble float and returns the Inumber result of the
   * subtraction between the scrabble's float minus this Inumber.
   */
  Itypes substract_to_Float(floats F);
  /**
   * Receives a Scrabble integer and returns the Inumber result of the
   * subtraction between the scrabble's integer input minus this Inumber.
   */
  Itypes substract_to_integer(integers I);
  /**
   * Receives a Scrabble float and returns the Inumber result of the
   * multiplication of this Inumber and input Scrabble float.
   */
  Itypes multiply_to_Float(floats F);
  /**
   * Receives a Scrabble integer and returns the Inumber result of the
   * multiplication of this Inumber and input Scrabble integer.
   */
  Itypes multiply_to_integer(integers I);
  /**
   * Receives a Scrabble float as input and returns the Inumber result of the
   * the input scrabble's float divided by this Inumber.
   */
  Itypes divide_a_Float(floats F);
  /**
   * Receives a Scrabble integer as input and returns the Inumber result of the
   * the input scrabble's float divided by this Inumber.
   */
  Itypes divide_a_integer(integers I);
  /**
   * Receives a Scrabble integer and returns the Inumber result of the
   * sum of this Inumber plus the input Scrabble integer.
   */
  Itypes sum_to_int(integers I);
  /**
   * Receives a Scrabble float and returns the Inumber result of the
   * sum of this Inumber plus the input Scrabble float.
   */
  Itypes sum_to_float(floats F);

  /**
   * Returns the SLogical result of the and operation between the SLogical input and
   * this SLogical.
   */
  Itypes and(Itypes L);

  /**
   * Returns the SLogical result of the or operation between the SLogical input and
   * this SLogical.
   */
  Itypes or(Itypes L);

  /**
   * Returns the Inumber result of the multiplication between the Inumber input
   * and this Inumber.
   */
  Itypes multiply(Itypes inumber);
  /**
   * Returns the Inumber result of the sum between the Inumber input
   * and this Inumber.
   */
  Itypes sum(Itypes inumber);
  /**
   * Returns the Inumber result of this Inumber minus the Inumber input.
   */
  Itypes substract(Itypes inumber);

  /**
   * Returns the Inumber result of this Inumber divide by the Inumber input.
   */
  Itypes divide(Itypes inumber);

  /**
   * If it exists, returns the negation of this scrabble type.
   */
  Itypes negate();

  /**
   * returns the Itypes evaluation of this object.
   */
  Itypes eval();


}
