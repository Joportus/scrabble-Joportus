package cl.uchile.dcc.scrabble.gui.Soperations.transformations;

import cl.uchile.dcc.scrabble.gui.Soperations.Constant;
import cl.uchile.dcc.scrabble.gui.Soperations.Operations;

public class toBooleans implements Operations{
    private final Operations a;

    public toBooleans(Operations a) {
        this.a = a;
    }

    @Override
    public Constant eval() {
        return a.eval().toBooleans();
    }
}
