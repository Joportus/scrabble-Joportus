package cl.uchile.dcc.scrabble.gui.Soperations;

import cl.uchile.dcc.scrabble.gui.Itypes;

public class Constant implements Operations {
    private final Itypes type;
    public Constant(Itypes type) {
        this.type = type;
    }

    @Override
    public Constant eval() {
        return this;
    }


    public Constant toBinary() {
        Itypes resultValue = this.getType().transform_to_binary();
        return new Constant(resultValue);
    }

    public Constant add(Constant c){
        Itypes result =  this.getType().sum(c.getType());
        return new Constant(result);
    }

    public Constant minus(Constant c){
        Itypes result = this.getType().substract(c.getType());
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
