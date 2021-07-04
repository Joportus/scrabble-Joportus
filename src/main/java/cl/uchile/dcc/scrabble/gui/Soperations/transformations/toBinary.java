package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This class represents a toBinary node in our AST.
 * This means each object created by this class represents the
 * transformation of a node to a binary.
 * In case that we evaluate the node, it would give us a
 * binary object.
 */
public class toBinary extends OneChildNodes {

    /** Creates a OneChildNodes object.
     * @param child is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     */
    public toBinary(treeNode child) {
        super(child);
    }
    /**
     * Returns the Itypes result of the transformation to binary resulted
     * from the evaluation of the child node (child.eval()).
     */
    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_binary();
    }
}
