package cl.uchile.dcc.scrabble.gui.Soperations;
import cl.uchile.dcc.scrabble.gui.FlowControl.FlowControlVisitor;
import cl.uchile.dcc.scrabble.gui.FlowControl.IfVisitor;
import cl.uchile.dcc.scrabble.gui.Itypes;

public interface treeNode {
    Itypes eval();
    Itypes acceptIf(IfVisitor visitor);

}
