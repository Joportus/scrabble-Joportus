package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Itypes;

import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class toFloats implements treeNode {

    private final treeNode a;

    public toFloats(treeNode a) {
        this.a = a;
    }


    @Override
    public Itypes eval() {
        return getA().eval().transform_to_float();
    }

    public treeNode getA() {
        return a;
    }
}
