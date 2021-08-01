package cl.uchile.dcc.scrabble.gui.Soperations.Comparisons;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

/**
 * This class represents a lesserThan comparison operation node in our AST.
 */
public class lesserThan extends Comparison{

    /**
     * Creates lesserThan object.
     *
     * @param var1 a String that refers to a variable object's name.
     *
     * @param var2 a String that refers to another variable object's name.
     *
     */
    public lesserThan(String var1, String var2) {
        super(var1, var2);
    }

    /**
     * If the variable var1 refers to is lesser than the variable var2 refers to, it Returns
     * a Scrabble Booleans containing true. Otherwise it returns a scrabble Booleans containing false.
     */
    @Override
    public Itypes eval() {
        Booleans STrue = booleansFactory.createBooleans(true);
        Booleans SFalse = booleansFactory.createBooleans(false);
        if(gVar(this.getVar1()).compareTo(gVar(this.getVar2())) == -1){
            return STrue;
        }
        else{
            return SFalse;
        }
    }
}
