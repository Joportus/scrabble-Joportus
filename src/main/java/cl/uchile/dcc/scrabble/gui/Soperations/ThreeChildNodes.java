package cl.uchile.dcc.scrabble.gui.Soperations;

public abstract class ThreeChildNodes implements treeNode{
    private final treeNode leftChild;
    private final treeNode middleChild;
    private final treeNode rightChild;

    /** Creates TwoChildNodes.
     * @param leftChild is a treeNode object, could be an operation
     *           or an Itype object(leaf node).
     *
     * @param middleChild
     * @param rightChild another treeNode object, could be an operation
     *                 or an Itype object(leaf node).
     *
     */
    protected ThreeChildNodes(treeNode leftChild, treeNode middleChild, treeNode rightChild) {
        this.leftChild = leftChild;
        this.middleChild = middleChild;
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

    /**
     * Returns this objects middle child node which is a treeNode object.
     */
    public  treeNode getMiddleChild(){
        return middleChild;
    }
}


