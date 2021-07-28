package cl.uchile.dcc.scrabble.gui.Soperations.Comparisons;

import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public abstract class Comparison implements treeNode, Comparisons{

    private final String var1;
    private final String var2;

    protected Comparison(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public String getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }
}
