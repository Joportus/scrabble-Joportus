package cl.uchile.dcc.scrabble.gui.Visitors;


import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.If;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;

public interface Visitor {

    /**
     * This Visitor object will visit an If object and it returns an Itypes object.
     */
    Itypes visitIf(If i);

    /**
     * This Visitor object will visit a While object and it returns an Itypes object.
     */
    Itypes visitWhile(While w);

}
