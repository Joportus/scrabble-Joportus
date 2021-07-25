package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.TwoChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;

public class While extends TwoChildNodes {


    /**
     * Creates TwoChildNodes.
     *
     * @param leftChild  is a treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     * @param rightChild another treeNode object, could be an operation
     *                   or an Itype object(leaf node).
     */
    public While(treeNode leftChild, treeNode rightChild) {
        super(leftChild, rightChild);
    }

    public Itypes accept(Visitor visitor){
        return visitor.visitWhile(this);
    }

    @Override
    public Itypes eval() {
        Visitor whileVisitor = new whileVisitor();
        return accept(whileVisitor);
    }

}
