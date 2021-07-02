package cl.uchile.dcc.scrabble.gui.Soperations;

/**
 * This abstract class holds the common behaviour
 * of all treeNode objects that have two children.
 */
public abstract class TwoChildNodes implements treeNode{
    private final treeNode leftChild;
    private final treeNode rightChild;

    /** Creates TwoChildNodes.
     * @param leftChild is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     *
     * @param rightChild another treeNode object, could be an operation
     *                 or an Itype object(leaf node).
     *
     * This constructor can never be used because it is protected.
     */
    protected TwoChildNodes(treeNode leftChild, treeNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Returns this objects left child node which is a treeNode object.
     */
    public treeNode getLeftChild() {
        return leftChild;
    }

    /**
     * Returns this objects right child node which is a treeNode object.
     */
    public treeNode getRightChild() {
        return rightChild;
    }
}
