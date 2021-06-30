package cl.uchile.dcc.scrabble.gui.Scrabble_types;

public class NullType extends Type {

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NullType;
    }

}
