package cl.uchile.dcc.scrabble.gui;

public abstract class Type implements Itypes{

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public Strings transform_to_string() {
        Strings transformed_value = new Strings(this.toString());
        return transformed_value;

    }

}
