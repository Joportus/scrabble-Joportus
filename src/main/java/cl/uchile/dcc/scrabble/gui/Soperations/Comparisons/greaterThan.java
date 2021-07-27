package cl.uchile.dcc.scrabble.gui.Soperations.Comparisons;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class greaterThan extends TwoChildNodes {
    /**
     * Creates TwoChildNodes.
     *
     * @param leftChild  is a treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     * @param rightChild another treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     */
    public greaterThan(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public Itypes eval() {
        Booleans STrue = booleansFactory.createBooleans(true);
        Booleans SFalse = booleansFactory.createBooleans(false);
        if(this.getLeftChild().eval().compareTo(this.getRightChild().eval()) == 1){
            return STrue;
        }
        else{
            return SFalse;
        }
    }

}
