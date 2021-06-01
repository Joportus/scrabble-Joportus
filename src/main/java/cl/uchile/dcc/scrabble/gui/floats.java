package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class floats extends Numbers{

    private final double float_value;
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
    public Itypes sum_to_int(integers I) {
        double result_value = this.getFloat_value() + I.getInt_value();
        floats result = new floats(result_value);
        return result;
    }

    @Override
    public Itypes sum_to_float(floats F) {
        double result_value = this.getFloat_value() + F.getFloat_value();
        floats result = new floats(result_value);
        return result;
    }

    @Override
    public Itypes sum(Itypes t) {
        return t.sum_to_float(this);
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

    @Override
    public Inumber substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.getFloat_value();
        return new floats(result_value);
    }

    @Override
    public Inumber substract_to_integer(integers I) {
        double result_value = I.getInt_value() - this.getFloat_value();
        return new floats(result_value);
    }

    @Override
    public Inumber substract(Inumber inumber) {
        return inumber.substract_to_Float(this);
    }

    @Override
    public Inumber multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.getFloat_value();
        return new floats(result_value);
    }

    @Override
    public Inumber multiply_to_integer(integers I) {
        double result_value = I.getInt_value() * this.getFloat_value();
        return new floats(result_value);
    }

    @Override
    public Inumber multiply(Inumber inumber) {
        return inumber.multiply_to_Float(this);
    }
}
