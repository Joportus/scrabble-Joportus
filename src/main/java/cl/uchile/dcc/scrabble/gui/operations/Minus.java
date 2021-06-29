package cl.uchile.dcc.scrabble.gui.operations;

public class Minus implements Operations{
    private final Operations m1;
    private final Operations m2;

    public Minus(Operations m1, Operations m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public Constant eval() {
        return m1.eval().minus(m2.eval());
    }

    @Override
    public Constant toBinary() {
        return null;
    }
}
