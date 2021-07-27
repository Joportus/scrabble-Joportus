package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.Comparisons;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.varModifier;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;

public class While implements treeNode{

    private Comparisons leftChild;
    private varModifier rightChild;

    public While(Comparisons leftChild, varModifier rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Itypes accept(Visitor visitor){
        return visitor.visitWhile(this);
    }

    @Override
    public Itypes eval() {
        Visitor whileVisitor = new whileVisitor();
        return this.accept(whileVisitor);
    }

    public Comparisons getLeftChild() {
        return leftChild;
    }

    public varModifier getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Comparisons leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(varModifier rightChild) {
        this.rightChild = rightChild;
    }
}
