package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.SNumber;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;

public class increaseVariable {

    private String v;

    private integers number;

    public variable calculate() {
        return new variable(this.getV(), gVar(this.getV()).sum(this.getNumber()));
    }

    public String getV() {
        return v;
    }

    public integers getNumber() {
        return number;
    }
}
