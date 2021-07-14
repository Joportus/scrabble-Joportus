package cl.uchile.dcc.scrabble.gui.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public interface FlowControlVisitor {

    Itypes visitTreeNode(treeNode node);
}
