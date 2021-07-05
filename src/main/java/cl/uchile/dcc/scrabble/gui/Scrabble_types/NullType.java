package cl.uchile.dcc.scrabble.gui.Scrabble_types;


/**
 * This class represents a NullType object.
 * represents a null.
 */
public class NullType extends Type {

    /**
     * Receives an object as an input, if its an instanceof NullType
     * returns true, otherwise it returns false.
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof NullType;
    }

}
