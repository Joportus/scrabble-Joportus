package cl.uchile.dcc.scrabble.gui.Visitors;


import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.If;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;

public interface Visitor {

    Itypes visitIf(If i);

    Itypes visitWhile(While w);

}
