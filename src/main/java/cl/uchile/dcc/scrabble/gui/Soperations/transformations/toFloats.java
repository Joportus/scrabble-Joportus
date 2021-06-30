package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.Operations;

public class toFloats implements Operations{

    private final Operations a;

    public toFloats(Operations a) {
        this.a = a;
    }


    @Override
    public Itypes eval() {
        return getA().eval().transform_to_float();
    }

    public Operations getA() {
        return a;
    }
}
