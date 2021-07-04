package cl.uchile.dcc.scrabble.gui.Soperations;

/**
 * This abstract class holds the common behaviour
 * of all treeNode objects that have one child.
 */
public abstract class OneChildNodes implements treeNode{
    private final treeNode child;

    /** Creates a OneChildNodes object.
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
}
