package cl.uchile.dcc.scrabble.gui.Controller.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Controller.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Controller.treeNode;

/**
 * This class represents a toBinary transformation node in our AST.
 * This means each object created by this class represents a transformation to binary
 * operation of a treeNode object.
 */
public class toBinary extends OneChildNodes {


    /** Creates a new toBinary object.
     * @param child is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     */
    public toBinary(treeNode child) {
        super(child);
    }

    /**
     * Returns the Itypes result of the transformation to binary applied to
     * the evaluation of the child node.
     */
    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_binary();
    }
}
