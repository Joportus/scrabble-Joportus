package cl.uchile.dcc.scrabble.gui;

public interface Itypes {


  /**
   * Returns a Scrabble Strings representation of this object.
   */
  Strings transform_to_string();
  /**
   * Returns a Scrabble Strings object resulting from the input's String value
   * concatenated to this objects toString() representation.
   */
  Strings sum_to_string(Strings S);

}
