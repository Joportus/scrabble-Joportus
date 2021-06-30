package cl.uchile.dcc.scrabble.gui.Soperations.math;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.Constant;
import cl.uchile.dcc.scrabble.gui.Soperations.Operations;

public class SAdd implements Operations {
    private final  Operations m1;
    private final Operations m2;

    public SAdd(Operations m1, Operations m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public Operations getM1() {
        return m1;
    }

    public Operations getM2() {
        return m2;
    }


    @Override
    public Itypes eval() {
        return this.getM1().eval().sum(this.getM2().eval());
    }
}
