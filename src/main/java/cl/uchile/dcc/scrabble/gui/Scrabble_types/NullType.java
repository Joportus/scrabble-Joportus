package cl.uchile.dcc.scrabble.gui.Scrabble_types;


import cl.uchile.dcc.scrabble.gui.Itypes;

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

    /**
     * Returns the Scrabble String representation of this object.
     */
    @Override
    public Itypes transform_to_string() {
        return this;
    }

    @Override
    public int compareTo(Itypes itypes) {
        return 0;
    }

    /**
     * Returns the Strings sum between this Itypes object and Strings S.
     * @return
     */
    @Override
    public Itypes sum_to_string(Strings S) {
        return this;
    }

}
