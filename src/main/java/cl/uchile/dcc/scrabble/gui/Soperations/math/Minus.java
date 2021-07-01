package cl.uchile.dcc.scrabble.gui.Soperations.math;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;


/**
 * This class represents a Minus node in our AST.
 * This means each object created by this class represents a
 * Subtraction(or Minus) Operation between two other nodes in an AST.
 */
public class Minus implements treeNode {
    private final treeNode m1;
    private final treeNode m2;

    /** Creates a new Minus object.
     * @param m1 is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     *
     * @param m2 another treeNode object, could be an operation
     *                 or an Itype object(leaf node).
     */
    public Minus(treeNode m1, treeNode m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public Itypes eval() {
        return this.getM1().eval().substract(this.getM2().eval());
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Minus) {
            var other = (Minus) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }

    public treeNode getM1() {
        return m1;
    }

    public treeNode getM2() {
        return m2;
    }
}
