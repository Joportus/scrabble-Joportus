package cl.uchile.dcc.scrabble.gui.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class WhileVisitor implements FlowControlVisitor{

    private Itypes value;

    public WhileVisitor(Itypes value) {
        this.value = value;
    }

    @Override
    public Itypes visitTreeNode(treeNode node) {
        return node.eval();
    }

    public void setValue(Itypes value) {
        this.value = value;
    }

    public Itypes getValue() {
        return value;
    }
}
