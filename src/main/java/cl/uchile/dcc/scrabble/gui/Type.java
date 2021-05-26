package cl.uchile.dcc.scrabble.gui;

public abstract class Type implements Itypes{

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public Strings transform_to_string() {
        return new Strings(this.toString());

    }
    @Override
    public floats transform_to_float(){
        return null;
    }
    @Override
    public integers transform_to_integers(){
        return null;
    }
    @Override
    public binary transform_to_binary(){
        return null;
    }
    @Override
    public Booleans transform_to_boolean(){
        return null;
    }
}
