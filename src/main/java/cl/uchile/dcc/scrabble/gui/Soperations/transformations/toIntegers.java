package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.Operations;

public class toIntegers implements Operations{

    private final Operations a;

    public toIntegers(Operations a) {
        this.a = a;
    }


    @Override
    public Itypes eval() {
        return getA().eval().transform_to_integers();
    }

    public Operations getA() {
        return a;
    }
}
