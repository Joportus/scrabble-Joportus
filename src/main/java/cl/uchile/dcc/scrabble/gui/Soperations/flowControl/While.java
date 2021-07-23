package cl.uchile.dcc.scrabble.gui.Soperations.flowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class While extends TwoChildNodes{

    /**
     * Creates TwoChildNodes.
     *
     * @param leftChild  is a treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     * @param rightChild another treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     */
    protected While(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public Itypes eval() {
        Itypes STrue = booleansFactory.createBooleans(true);
        return STrue;
    }
}
