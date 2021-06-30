package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Itypes;

public class NullType extends Type {


    @Override
    public boolean equals(Object obj) {
        return obj instanceof NullType;
    }

}
