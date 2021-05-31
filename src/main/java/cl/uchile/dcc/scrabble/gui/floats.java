package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class floats extends Numbers{
    private double float_value;
    public floats(double float_value){
        this.float_value = float_value;
    }

    public double getFloat_value() {
        return float_value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getFloat_value());
    }

    @Override
    public floats transform_to_float() {
        return new floats(this.getFloat_value());
    }

    @Override
    public int hashCode(){
        return Objects.hash(floats.class);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof floats) {
            var other = (floats) obj;
            return other.getFloat_value() == this.getFloat_value();
        }
        return false;
    }
}
