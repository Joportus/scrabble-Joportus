package cl.uchile.dcc.scrabble.gui.Soperations.math;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.Constant;
import cl.uchile.dcc.scrabble.gui.Soperations.Operations;

public class Minus implements Operations {
    private final Operations m1;
    private final Operations m2;

    public Minus(Operations m1, Operations m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public Itypes eval() {
        return this.getM1().eval().substract(this.getM2().eval());
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Minus) {
            var other = (Minus) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }

    public Operations getM1() {
        return m1;
    }

    public Operations getM2() {
        return m2;
    }
}
