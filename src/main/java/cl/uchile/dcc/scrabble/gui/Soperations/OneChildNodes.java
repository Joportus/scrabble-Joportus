package cl.uchile.dcc.scrabble.gui.Soperations;

import cl.uchile.dcc.scrabble.gui.FlowControl.FlowControlVisitor;
import cl.uchile.dcc.scrabble.gui.FlowControl.IfVisitor;
import cl.uchile.dcc.scrabble.gui.Itypes;

/**
 * This abstract class holds the common behaviour
 * of all treeNode objects that have one child.
 */
public abstract class OneChildNodes implements treeNode{
    private final treeNode child;

    /** Creates TwoChildNodes.
     * @param child is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     *
     * This constructor can never be used because it is protected.
     */
    protected OneChildNodes(treeNode child) {
        this.child = child;
    }

    /**
     * Returns this object's child node which is a treeNode object.
     */
    public treeNode getChild() {
        return child;
    }

    public Itypes acceptIf(IfVisitor visitor){
        return visitor.visitTreeNode(this);
    }
}
