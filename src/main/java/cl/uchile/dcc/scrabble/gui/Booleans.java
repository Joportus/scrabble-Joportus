package cl.uchile.dcc.scrabble.gui;

public class Booleans extends Type{
    private boolean bool_value;
    public Booleans(boolean bool_value) {
        this.bool_value = bool_value;
    }

    public boolean isBool_value() {
        return bool_value;
    }

    @Override
    public Booleans transform_to_boolean() {
        return new Booleans(this.isBool_value());
    }
}
