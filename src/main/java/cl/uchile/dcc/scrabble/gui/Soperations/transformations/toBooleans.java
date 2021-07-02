package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class toBooleans extends OneChildNodes {

    public toBooleans(treeNode child) {
        super(child);
    }

    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_boolean();
    }

}
