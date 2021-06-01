package cl.uchile.dcc.scrabble.gui;

public interface Itypes {

  Strings transform_to_string();
  floats transform_to_float();
  integers transform_to_integers();
  binary transform_to_binary();
  Booleans transform_to_boolean();
  Itypes sum_a_int(integers I);
  Itypes sum_a_float(floats F);
  Itypes sum(Itypes t);
}
