package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This class represents a toBooleans transformation node in our AST.
 * This means each object created by this class represents a transformation to Booleans
 * operation of a treeNode object.
 */
public class toBooleans extends OneChildNodes {

    /** Creates a new toBooleans object.
     * @param child is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     */
    public toBooleans(treeNode child) {
        super(child);
    }

    /**
     * Returns the Itypes result of the transformation to boolean applied to
     * the evaluation of the child node.
     */
    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_boolean();
    }

}
