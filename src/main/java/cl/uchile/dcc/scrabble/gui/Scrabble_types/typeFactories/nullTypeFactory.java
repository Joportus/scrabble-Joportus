package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;


import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;

/**
 * This class represents a nullType Factory.
 * It creates nullType objects.
 */
public class nullTypeFactory {
    /**
     * NullType object for our factory
     **/
    private static final NullType n = new NullType();

    /**
     * Every time we create a NullType with creteNull it
     * returns n, a NullType object that was already created.
     **/
    public static NullType createNull(){
        return n;
    }
}
