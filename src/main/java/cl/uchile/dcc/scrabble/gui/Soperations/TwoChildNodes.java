package cl.uchile.dcc.scrabble.gui.Soperations;

public abstract class TwoChildNodes implements treeNode{
    private final treeNode leftChild;
    private final treeNode rightChild;

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
