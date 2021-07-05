package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a nullType Factory.
 * It creates nullType objects.
 */
public class nullTypeFactory {
    /**
     * NullType object for our factory
     **/
    static NullType n = createNull();

    /**
     * Every time we create a NullType with creteNull it
     * returns n, a NullType object that was already created.
     **/
    public static NullType createNull(){
        return n;
    }
}
