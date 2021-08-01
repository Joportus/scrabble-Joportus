package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;


import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;


/**
 * This class represents a multiplyToVar operation in our AST.
 */
public class multiplyToVar extends varModifier{

    /**
     * Creates multiplyToVar object.
     *
     * @param variable a String that refers to a variable object's name.
     *
     * @param number a String that refers to another variable object's name that operates with variable.
     *
     */
    public multiplyToVar(String variable, String number) {
        super(variable, number);
    }

    /**
     * It takes the first variables value multiplied by the second variables (number) value, and uses this new value to update
     * the variable referenced by the String variable. It then returns the updated Itypes value.
     */
    @Override
    public Itypes eval() {
        return new variable(this.getVariable(), gVar(this.getVariable()).multiply(gVar(this.getNumber()))).eval();
    }
}
