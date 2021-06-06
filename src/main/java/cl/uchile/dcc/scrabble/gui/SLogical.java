package cl.uchile.dcc.scrabble.gui;

public interface SLogical {

    /**
     * Receives a Scrabble's Booleans as input and returns an SLogical representing
     * the result of a logical and operation between the Scrabble Booleans input and this SLogical.
     */
    SLogical bool_and(Booleans B);
    /**
     * Receives a Scrabble's binary as input and returns an SLogical representing
     * the result of a logical and operation between the Scrabble binary input and this SLogical.
     */
    SLogical binary_and(binary Bin);
    /**
     * Returns the SLogical result of the and operation between the SLogical input and
     * this SLogical.
     */
    SLogical and(SLogical L);
    /**
     * Receives a Scrabble's Booleans as input and returns an SLogical representing
     * the result of a logical or operation between the Scrabble Booleans input and this SLogical.
     */
    SLogical bool_or(Booleans B);
    /**
     * Receives a Scrabble's binary as input and returns an SLogical representing
     * the result of a logical or operation between the Scrabble binary input and this SLogical.
     */
    SLogical binary_or(binary Bin);
    /**
     * Returns the SLogical result of the or operation between the SLogical input and
     * this SLogical.
     */
    SLogical or(SLogical L);

}

