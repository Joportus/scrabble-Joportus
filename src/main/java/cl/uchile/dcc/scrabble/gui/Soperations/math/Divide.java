package cl.uchile.dcc.scrabble.gui.Soperations.math;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This class represents a Division node in our AST.
 * This means each object created by this class represents a
 * division Operation between two other nodes in an AST.
 */
public class Divide implements treeNode{
    private final treeNode m1;
    private final treeNode m2;


    /**Creates a new Divide object.
     * @param m1 is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     *
     * @param m2 another treeNode object, could be an operation
     *                 or an Itype object(leaf node).
     */
    public Divide(treeNode m1, treeNode m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    /**
     * Returns the Itypes result of the division between the evaluation of the left
     * child of this node (m1.eval()) and the right child of this node (m2.eval()).
     */
    @Override
    public Itypes eval() {
        return this.getM1().eval().divide(this.getM2().eval());
    }

    /**
     * Receives an object as an input, if this object is an object of this class(divide)
     * and its evaluation (other.eval()) is equal to this objects evaluation (this.eval)
     * it returns true. Otherwise, it returns false.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Divide) {
            var other = (Divide) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }

    /**
     * Returns this objects left child node (m1) which is a treeNode object.
     */
    public treeNode getM1() {
        return m1;
    }

    /**
     * Returns this objects right child node (m1) which is a treeNode object.
     */
    public treeNode getM2() {
        return m2;
    }
}
