package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class toBinary implements treeNode {

    private final treeNode a;

    public toBinary(treeNode a) {
        this.a = a;
    }


    @Override
    public Itypes eval() {
        return getA().eval().transform_to_binary();
    }

    public treeNode getA() {
        return a;
    }
}
