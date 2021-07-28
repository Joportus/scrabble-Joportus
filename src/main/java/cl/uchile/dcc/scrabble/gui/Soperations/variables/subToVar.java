package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.SNumber;


import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

public class subToVar extends varModifier {

    public subToVar(String variable, SNumber number) {
        super(variable, number);
    }

    @Override
    public Itypes eval() {
        return new variable(this.getVariable(), gVar(this.getVariable()).substract(this.getNumber())).eval();
    }
}
