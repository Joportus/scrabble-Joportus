package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.ThreeChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.ifVisitor;

/**
 * This class represents an If operation node in our AST.
 */
public class If extends ThreeChildNodes {
    /**
     * Creates If object.
     *
     * @param leftChild   is a treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     *
     * @param middleChild another treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     *
     * @param rightChild  third treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     */
    public If(treeNode leftChild, treeNode middleChild, treeNode rightChild) {
        super(leftChild, middleChild, rightChild);
    }

    /**
     * Receives a visitor object which uses this object as input for it's visitIf method. It returns
     * the result of this method.
     */
    public Itypes accept(Visitor visitor){
        return visitor.visitIf(this);
    }

    /**
     * This method creates an ifVisitor and then it returns the result of calling this object's
     * accept visitor method with the created visitor as the parameter.
     */
    @Override
    public Itypes eval() {
        ifVisitor iVisitor = new ifVisitor();
        return this.accept(iVisitor);
    }
}
