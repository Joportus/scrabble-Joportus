package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Itypes;

public interface SNumber extends Itypes {

    /**
     * Receives an integers object as input and returns an compares that object
     * to this object. It then returns an int as a result of the comparison.
     */
    int compareToInt(integers i);

    /**
     * Receives a floats object as input and returns an compares that object
     * to this object. It then returns an int as a result of the comparison.
     */
    int compareToFloat(floats f);

    /**
     * Receives a binary object as input and returns an compares that object
     * to this object. It then returns an int as a result of the comparison.
     */
    int compareToBinary(binary b);
}
