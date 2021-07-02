package cl.uchile.dcc.scrabble.gui.Soperations.logic;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class LAnd extends TwoChildNodes {


    public LAnd(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public Itypes eval() {
        return this.getLeftChild().eval().and(this.getRightChild().eval());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LAnd) {
            var other = (LAnd) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }
}
