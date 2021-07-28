package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.If;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;


public class whileVisitor implements Visitor{


    @Override
    public Itypes visitIf(If i) {
        return nullTypeFactory.createNull();
    }

    public Itypes visitWhile(While w) {

        Itypes STrue = new Booleans(true);

        while(w.getLeftChild().eval().equals(STrue)){

            w.getRightChild().eval();

        }
        return null;
    }

}



