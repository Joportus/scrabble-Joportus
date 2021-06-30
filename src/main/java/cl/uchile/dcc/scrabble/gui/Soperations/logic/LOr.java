package cl.uchile.dcc.scrabble.gui.Soperations.logic;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.Operations;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;

public class LOr implements Operations{
    private final Operations m1;
    private final Operations m2;

    public LOr(Operations m1, Operations m2) {
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
        return this.getM1().eval().or(this.getM2().eval());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LOr) {
            var other = (LOr) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }
}
