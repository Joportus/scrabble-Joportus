package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.ThreeChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class If extends ThreeChildNodes {
    /**
     * Creates TwoChildNodes.
     *
     * @param leftChild   is a treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     * @param middleChild
     * @param rightChild  another treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     */
    public If(treeNode leftChild, treeNode middleChild, treeNode rightChild) {
        super(leftChild, middleChild, rightChild);
    }

    @Override
    public Itypes eval() {
        Booleans STrue = booleansFactory.createBooleans(true);
        Booleans SFalse = booleansFactory.createBooleans(true);
        if(this.getLeftChild().equals(STrue)){
            return this.getMiddleChild().eval();
        }
        else if(this.getLeftChild().equals(SFalse)){
            return this.getRightChild().eval();
        }
        else{
            return nullTypeFactory.createNull();
        }
    }
}
