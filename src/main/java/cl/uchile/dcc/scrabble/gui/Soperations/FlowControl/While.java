package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.Comparisons;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.addToVar;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;

public class While implements treeNode{

    private final treeNode leftChild;
    private final treeNode rightChild;

    public While(treeNode leftChild, treeNode rightChild) {
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

    public treeNode getLeftChild() {
        return leftChild;
    }

    public treeNode getRightChild() {
        return rightChild;
    }

}
