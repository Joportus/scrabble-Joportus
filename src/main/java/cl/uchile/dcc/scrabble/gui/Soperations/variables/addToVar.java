package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;


/**
 * This class represents an addToVar operation in our AST.
 */
public class addToVar extends varModifier{

    /**
     * Creates addToVar object.
     *
     * @param variable a String that refers to a variable object's name.
     *
     * @param number a String that refers to another variable object's name that operates with variable.
     *
     */
    public addToVar(String variable, String number) {
        super(variable, number);
    }

    /**
     * It takes the first variables value plus the second variables (number) value, and uses this new value to update
     * the variable referenced by the String variable. It then returns the updated Itypes value.
     */
    @Override
    public Itypes eval() {
        return new variable(this.getVariable(), gVar(this.getVariable()).sum(gVar(this.getNumber()))).eval();
    }


}
