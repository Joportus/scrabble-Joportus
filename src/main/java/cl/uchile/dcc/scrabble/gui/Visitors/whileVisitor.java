package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.If;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;


/**
 * This class represents a visitor that visits While objects.
 */
public class whileVisitor implements Visitor{

    /**
     * Receives an IF object and always returns a nullType object.
     */
    @Override
    public Itypes visitIf(If i) {
        return nullTypeFactory.createNull();
    }

    /**
     * Receives a While w object, while the leftChild of this While objects evaluation is equal to a Booleans
     * true it will evaluate the right child of w. The last evaluation will be stored in an Itypes result, which will
     * be returned.
     */
    public Itypes visitWhile(While w) {

        Itypes STrue = new Booleans(true);
        Itypes result = nullTypeFactory.createNull();

        while(w.getLeftChild().eval().equals(STrue)){

            result = w.getRightChild().eval();

        }
        return result;
    }




}



