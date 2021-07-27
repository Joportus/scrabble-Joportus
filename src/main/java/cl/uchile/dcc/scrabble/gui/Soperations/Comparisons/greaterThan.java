package cl.uchile.dcc.scrabble.gui.Soperations.Comparisons;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.variable;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

public class greaterThan implements treeNode, Comparisons{

    private String var1;
    private String var2;

    public greaterThan(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public Itypes eval() {
        Booleans STrue = booleansFactory.createBooleans(true);
        Booleans SFalse = booleansFactory.createBooleans(false);
        if(gVar(this.getVar1()).compareTo(gVar(this.getVar2())) == 1){
            return STrue;
        }
        else{
            return SFalse;
        }

    }

    public String getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }
}
