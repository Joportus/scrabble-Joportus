package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.If;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;

public class ifVisitor implements Visitor{

    public Itypes visitIf(If i){
        Booleans STrue = booleansFactory.createBooleans(true);
        Booleans SFalse = booleansFactory.createBooleans(false);

        if(i.getLeftChild().eval().equals(STrue)){
            return i.getMiddleChild().eval();
        }
        else if(i.getLeftChild().eval().equals(SFalse)){
            return i.getRightChild().eval();
        }
        else{
            return nullTypeFactory.createNull();
        }
    }

    @Override
    public Itypes visitWhile(While w) {
        return nullTypeFactory.createNull();
    }
}
