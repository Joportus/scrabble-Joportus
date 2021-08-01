package cl.uchile.dcc.scrabble.gui.Soperations.variables;


import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

/**
 * This is an abstract class that holds all common characteristics of a variable modifying operation.
 */
public abstract class varModifier implements treeNode {

    private final String variable;

    private final String number;

    /**
     * Creates varModifier object.
     *
     * @param variable a String that refers to a variable object's name.
     *
     * @param number a String that refers to another variable object's name that operates with variable.
     *
     * This constructor is protected so it cannot be used.
     */
    protected varModifier(String variable, String number) {
        this.variable = variable;
        this.number = number;
    }

    /**
     * Returns this objects variable String.
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Returns this objects number String.
     */
    public String getNumber() {
        return number;
    }
}
