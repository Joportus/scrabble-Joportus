package cl.uchile.dcc.scrabble.gui.Soperations.logic;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.OneChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class LNegate extends OneChildNodes {

    public LNegate(treeNode child) {
        super(child);
    }

    @Override
    public Itypes eval() {
        return getChild().eval().negate();
    }

}
