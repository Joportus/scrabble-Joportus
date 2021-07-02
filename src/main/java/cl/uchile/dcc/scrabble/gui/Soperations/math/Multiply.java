package cl.uchile.dcc.scrabble.gui.Soperations.math;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This class represents a Multiply node in our AST.
 * This means each object created by this class represents a
 * multiplication operation between two other nodes in an AST.
 */
public class Multiply extends TwoChildNodes {

    /** Creates a new Multiply object.
     * @param leftChild is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     *
     * @param rightChild another treeNode object, could be an operation
     *                 or an Itype object(leaf node).
     */
    public Multiply(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    /**
     * Returns the Itypes result of the multiplication between the evaluation of the left
     * child of this node (leftChild.eval()) and the right child of this node (rightChild.eval()).
     */
    @Override
    public Itypes eval() {
        return this.getLeftChild().eval().multiply(this.getRightChild().eval());
    }

    /**
     * Receives an object as an input, if this object is an object of this class(Multiply)
     * and its evaluation (other.eval()) is equal to this objects evaluation (this.eval)
     * it returns true. Otherwise, it returns false.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Multiply) {
            var other = (Multiply) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }
}
