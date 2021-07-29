package cl.uchile.dcc.scrabble.gui.Soperations.Comparisons;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

public class notEqual extends Comparison{

    public notEqual(String var1, String var2) {
        super(var1, var2);
    }

    @Override
    public Itypes eval() {
        Booleans STrue = booleansFactory.createBooleans(true);
        Booleans SFalse = booleansFactory.createBooleans(false);
        if(gVar(this.getVar1()).compareTo(gVar(this.getVar2())) != 0){
            return STrue;
        }
        else{
            return SFalse;
        }
    }
}
