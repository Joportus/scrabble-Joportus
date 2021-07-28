package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Itypes;

public interface SNumber extends Itypes {

    int compareToInt(integers i);

    int compareToFloat(floats f);

    int compareToBinary(binary b);
}
