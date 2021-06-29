package cl.uchile.dcc.scrabble.gui.operations;


public class Add implements Operations{
    private final Operations a1;
    private final Operations a2;

    public Add(Operations a1, Operations a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public Constant eval() {
        return a1.eval().add(a2.eval());
    }

    @Override
    public Constant toBinary() {
        return this.eval().toBinary();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Add) {
            var other = (Add) obj;
            return other.eval().equals(this.eval());
        }
        return false;
    }

}
