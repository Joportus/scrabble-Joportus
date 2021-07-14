package cl.uchile.dcc.scrabble.gui.Controller.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Controller.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Controller.treeNode;

/**
 * This class represents a toStrings transformation node in our AST.
 * This means each object created by this class represents a transformation to Strings
 * operation of a treeNode object.
 */
public class toStrings extends OneChildNodes {

    /** Creates a new toStrings object.
     * @param child is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     */
    public toStrings(treeNode child) {
        super(child);
    }

    /**
     * Returns the Itypes result of the transformation to Strings applied to
     * the evaluation of the child node.
     */
    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_string();
    }

}
