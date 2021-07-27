package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.Comparisons;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.variable;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;

public class While implements treeNode{

    private Comparisons leftChild;
    private variable rightChild;

    public While(Comparisons leftChild, variable rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Itypes accept(Visitor visitor){
        return visitor.visitWhile(this);
    }

    @Override
    public Itypes eval() {
        Visitor whileVisitor = new whileVisitor();
        return accept(whileVisitor);
    }

    public Comparisons getLeftChild() {
        return leftChild;
    }

    public variable getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Comparisons leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(variable rightChild) {
        this.rightChild = rightChild;
    }
}
