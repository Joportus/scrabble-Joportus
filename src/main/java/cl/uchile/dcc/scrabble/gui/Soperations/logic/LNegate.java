package cl.uchile.dcc.scrabble.gui.Soperations.logic;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class LNegate implements treeNode{
    private final treeNode a;

    public LNegate(treeNode a) {
        this.a = a;
    }


    @Override
    public Itypes eval() {
        return getA().eval().negate();
    }

    public treeNode getA() {
        return a;
    }
}
