package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;

import java.util.HashMap;
import java.util.Map;

public class nullTypeFactory {

    static NullType n = createNull();

    public static NullType createNull(){
        return n;
    }
}
