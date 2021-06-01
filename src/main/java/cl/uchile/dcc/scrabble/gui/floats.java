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
    public Itypes sum_a_int(integers I) {
        double result_value = this.getFloat_value() + I.getInt_value();
        floats result = new floats(result_value);
        return result;
    }

    @Override
    public Itypes sum_a_float(floats F) {
        double result_value = this.getFloat_value() + F.getFloat_value();
        floats result = new floats(result_value);
        return result;
    }

    @Override
    public Itypes sum(Itypes t) {
        return t.sum_a_float(this);
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
