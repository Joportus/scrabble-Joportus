package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.SNumber;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public abstract class varModifier implements treeNode {

    private final String variable;

    private final SNumber number;

    protected varModifier(String variable, SNumber number) {
        this.variable = variable;
        this.number = number;
    }

    public String getVariable() {
        return variable;
    }

    public SNumber getNumber() {
        return number;
    }
}
