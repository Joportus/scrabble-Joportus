package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.Operations;

public class toBinary implements Operations {

    private final Operations a;

    public toBinary(Operations a) {
        this.a = a;
    }


    @Override
    public Itypes eval() {
        return getA().eval().transform_to_binary();
    }

    public Operations getA() {
        return a;
    }
}
