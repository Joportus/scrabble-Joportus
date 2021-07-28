package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.SNumber;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

public class multiplyToVar extends varModifier{

    public multiplyToVar(String variable, SNumber number) {
        super(variable, number);
    }

    @Override
    public Itypes eval() {
        return new variable(this.getVariable(), gVar(this.getVariable()).multiply(this.getNumber())).eval();
    }
}
