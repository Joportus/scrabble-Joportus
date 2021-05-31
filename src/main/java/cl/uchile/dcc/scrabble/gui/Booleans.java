package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Booleans) {
            var other = (Booleans) obj;
            return other.isBool_value() == this.isBool_value();
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(Booleans.class);
    }
}
