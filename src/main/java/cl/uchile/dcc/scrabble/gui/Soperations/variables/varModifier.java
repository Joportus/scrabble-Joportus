package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.SNumber;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

public class varModifier {

    private String variable;

    private integers number;

    public varModifier(String v, integers number) {
        this.variable = v;
        this.number = number;
    }

    public variable calculate() {
        return new variable(this.getVariable(), gVar(this.getVariable()).sum(this.getNumber()));
    }

    public String getVariable() {
        return variable;
    }

    public integers getNumber() {
        return number;
    }
}
