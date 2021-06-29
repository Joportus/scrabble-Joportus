package cl.uchile.dcc.scrabble.gui.Soperations;

public class toBinary implements Operations{

    private final Operations a;

    public toBinary(Operations a) {
        this.a = a;
    }

    @Override
    public Constant eval() {
        return a.eval().toBinary();
    }

}
