package cl.uchile.dcc.scrabble.gui.Soperations;

public abstract class OneChildNodes implements treeNode{
    private final treeNode child;

    protected OneChildNodes(treeNode child) {
        this.child = child;
    }

    public treeNode getChild() {
        return child;
    }
}
