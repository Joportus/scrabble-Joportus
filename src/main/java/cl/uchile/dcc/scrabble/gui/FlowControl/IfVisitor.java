package cl.uchile.dcc.scrabble.gui.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;


public class IfVisitor implements FlowControlVisitor{

    @Override
    public Itypes visitTreeNode(treeNode node) {
        return node.eval();
    }

    public Itypes SIf(treeNode cond, treeNode ifTrue, treeNode ifFalse){
        Itypes STrue = booleansFactory.createBooleans(true);
        Itypes SFalse = booleansFactory.createBooleans(false);
        if(cond.acceptIf(this).eval().equals(STrue)){
            return ifTrue.acceptIf(this);
        }
        else if(cond.acceptIf(this).eval().equals(SFalse)){
            return ifFalse.acceptIf(this);
        }
        else{
            return nullTypeFactory.createNull();
        }
    }
    public static Itypes CIf(treeNode cond, treeNode ifTrue, treeNode ifFalse){
        IfVisitor ifVisitor = new IfVisitor();
        return ifVisitor.SIf(cond, ifTrue, ifFalse);
    }
}
