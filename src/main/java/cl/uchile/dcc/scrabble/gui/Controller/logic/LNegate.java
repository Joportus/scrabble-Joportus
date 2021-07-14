package cl.uchile.dcc.scrabble.gui.Controller.logic;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Controller.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Controller.treeNode;

/**
 * This class represents a LNegate transformation node in our AST.
 * This means each object created by this class represents a negation
 * operation of a treeNode object.
 */
public class LNegate extends OneChildNodes {

    /** Creates a new LNegate object.
     * @param child is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     */
    public LNegate(treeNode child) {
        super(child);
    }


    /**
     * Returns the Itypes result of the negate operation applied to
     * the evaluation of the child node.
     */
    @Override
    public Itypes eval() {
        return getChild().eval().negate();
    }

}
