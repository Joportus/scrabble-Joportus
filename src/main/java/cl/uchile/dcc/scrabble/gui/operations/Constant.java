package cl.uchile.dcc.scrabble.gui.operations;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;

public class Constant implements Operations {
    Itypes type;
    public Constant(Itypes type) {
        this.type = type;
    }

    @Override
    public Constant eval() {
        return this;
    }
    public Constant add(Constant c){
        Itypes result =  this.getType().sum(c.getType());
        return new Constant(result);
    }

    public Itypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Constant) {
            var other = (Constant) obj;
            return other.getType().equals(this.getType());
        }
        return false;
    }

}
