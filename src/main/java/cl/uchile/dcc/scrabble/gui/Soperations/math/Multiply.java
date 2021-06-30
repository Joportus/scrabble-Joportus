package cl.uchile.dcc.scrabble.gui.Soperations.math;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class Multiply implements treeNode{
    private final treeNode m1;
    private final treeNode m2;

    public Multiply(treeNode m1, treeNode m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public treeNode getM1() {
        return m1;
    }

    public treeNode getM2() {
        return m2;
    }


    @Override
    public Itypes eval() {
        return this.getM1().eval().multiply(this.getM2().eval());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SAdd) {
            var other = (SAdd) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }
}
