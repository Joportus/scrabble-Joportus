package cl.uchile.dcc.scrabble.gui.Soperations.logic;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;


public class LOr extends TwoChildNodes {


    public LOr(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public Itypes eval() {
        return this.getLeftChild().eval().or(this.getRightChild().eval());
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
