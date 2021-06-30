package cl.uchile.dcc.scrabble.gui.Soperations;

import cl.uchile.dcc.scrabble.gui.Itypes;

public class Constant implements Operations {
    private final Itypes type;
    public Constant(Itypes type) {
        this.type = type;
    }



    public Constant toBinary() {
        Itypes resultValue = this.getType().transform_to_binary();
        return new Constant(resultValue);
    }
    public Constant toBooleans(){
        Itypes resultValue = this.getType().transform_to_boolean();
        return new Constant(resultValue);
    }
    public Constant toFloats(){
        Itypes resultValue = this.getType().transform_to_float();
        return new Constant(resultValue);
    }

    public Constant toIntegers(){
        Itypes resultValue = this.getType().transform_to_integers();
        return new Constant(resultValue);
    }

    public Constant toStrings(){
        Itypes resultValue = this.getType().transform_to_string();
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

    public Constant lor(Constant c){
        Itypes result = this.getType().or(c.getType());
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
