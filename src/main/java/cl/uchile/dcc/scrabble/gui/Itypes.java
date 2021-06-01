package cl.uchile.dcc.scrabble.gui;

public interface Itypes {

  Strings transform_to_string();
  floats transform_to_float();
  integers transform_to_integers();
  binary transform_to_binary();
  Booleans transform_to_boolean();
  Itypes sum_to_int(integers I);
  Itypes sum_to_float(floats F);
  Strings sum_to_string(Strings S);
  //binary sum_a_binary(binary B);
  Itypes sum(Itypes t);

}
