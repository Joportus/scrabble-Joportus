package cl.uchile.dcc.scrabble.gui.operations;

public class SAdd implements Operations{
    private final Operations m1;
    private final Operations m2;

    public SAdd(Operations m1, Operations m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public Constant eval() {
        return m1.eval().add(m2.eval());
    }

    @Override
    public Constant toBinary() {
        return this.eval().toBinary();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SAdd) {
            var other = (SAdd) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }
}
