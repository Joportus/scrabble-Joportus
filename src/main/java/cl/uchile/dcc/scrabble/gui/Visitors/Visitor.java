package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;

public interface Visitor {
    Itypes visitWhile(While w);
}
