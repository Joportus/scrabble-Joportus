package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class toBinary extends OneChildNodes {


    public toBinary(treeNode child) {
        super(child);
    }

    @Override
    public Itypes eval() {
        return getChild().eval().transform_to_binary();
    }
}
