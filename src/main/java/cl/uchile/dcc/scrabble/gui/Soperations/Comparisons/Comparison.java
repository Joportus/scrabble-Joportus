package cl.uchile.dcc.scrabble.gui.Soperations.Comparisons;

import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This is an abstract class that holds all common characteristics of a Comparison operation.
 */
public abstract class Comparison implements treeNode, Comparisons{

    private final String var1;
    private final String var2;

    /**
     * Creates Comparison object.
     *
     * @param var1 a String that refers to a variable object's name.
     *
     * @param var2 a String that refers to another variable object's name.
     *
     * This constructor is protected so it cannot be used.
     */
    protected Comparison(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }


    /**
     * returns this object's var1 String
     */
    public String getVar1() {
        return var1;
    }

    /**
     * returns this object's var2 String
     */
    public String getVar2() {
        return var2;
    }
}
