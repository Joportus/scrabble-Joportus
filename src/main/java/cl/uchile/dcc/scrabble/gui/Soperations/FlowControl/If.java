package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.ThreeChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.ifVisitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;

public class If extends ThreeChildNodes {
    /**
     * Creates TwoChildNodes.
     *
     * @param leftChild   is a treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     *
     * @param middleChild another treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     *
     * @param rightChild  third treeNode object, could be an operation
     *                    or an Itype object(leaf node).
     */
    public If(treeNode leftChild, treeNode middleChild, treeNode rightChild) {
        super(leftChild, middleChild, rightChild);
    }

    public Itypes accept(Visitor visitor){
        return visitor.visitIf(this);
    }

    @Override
    public Itypes eval() {
        ifVisitor iVisitor = new ifVisitor();
        return this.accept(iVisitor);
    }
}
