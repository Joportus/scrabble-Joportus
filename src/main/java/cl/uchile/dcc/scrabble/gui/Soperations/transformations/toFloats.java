package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This class represents a toBinary transformation node in our AST.
 * This means each object created by this class represents a transformation to binary
 * operation of a treeNode object.
 */
public class toFloats extends OneChildNodes {

    public toFloats(treeNode child) {
        super(child);
    }

    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_float();
    }

}
