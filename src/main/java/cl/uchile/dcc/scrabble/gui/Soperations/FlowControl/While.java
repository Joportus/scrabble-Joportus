package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;

public class While extends TwoChildNodes {


    /**
     * Creates While object.
     *
     * @param leftChild  is a treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     * @param rightChild another treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     */
    public While(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    /**
     * Receives a visitor object which uses this object as input for it's visitWhile method. It returns
     * the result of this method.
     */
    public Itypes accept(Visitor visitor){
        return visitor.visitWhile(this);
    }

    /**
     * This method creates a whileVisitor and then it returns the result of calling this object's
     * accept visitor method with the created visitor as the parameter.
     */
    @Override
    public Itypes eval() {
        whileVisitor wVisitor = new whileVisitor();
        return this.accept(wVisitor);
    }


}
