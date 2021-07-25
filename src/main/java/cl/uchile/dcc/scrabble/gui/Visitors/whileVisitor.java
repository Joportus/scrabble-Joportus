package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class whileVisitor implements Visitor{

    @Override
    public Itypes visitWhile(While w) {
        treeNode cond = w.getLeftChild();
        treeNode task = w.getRightChild();
        while(cond.eval().equals(new Booleans(true))){
            task.eval();
        }
        return null;
    }

}
