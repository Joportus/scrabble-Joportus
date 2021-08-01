package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.If;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;

/**
 * This class represents a visitor that visits If objects.
 */
public class ifVisitor implements Visitor{

    /**
     * Receives an If object. It takes the If object leftChild and evaluates its Booleans condition.
     * If it's true, it returns the evaluation of the middleChild. If it's false it returns the evaluation
     * of the rightChild. If the leftChild evaluation is not Booleans it will return a NullType.
     */
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

    /**
     * Receives a While object and always returns a nullType object.
     */
    @Override
    public Itypes visitWhile(While w) {
        return nullTypeFactory.createNull();
    }
}
