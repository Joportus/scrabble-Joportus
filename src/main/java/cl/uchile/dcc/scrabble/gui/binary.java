package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class binary extends Numbers{
    private String binary_value;
    public binary(String binary_value){
        this.binary_value = binary_value;
    }

    public String getBinary_value() {
        return binary_value;
    }

    @Override
    public String toString() {
        return this.getBinary_value();
    }

/**
    @Override
    public floats transform_to_float() {
        return super.transform_to_float();
    }

    @Override
    public integers transform_to_integers() {
        return super.transform_to_integers();
    }
**/

    @Override
    public binary transform_to_binary() {
        return new binary(this.getBinary_value());
    }

    @Override
    public Itypes sum_to_int(integers I) {
        return super.sum_to_int(I);
    }

    @Override
    public Itypes sum_to_float(floats F) {
        return super.sum_to_float(F);
    }

    @Override
    public Strings sum_to_string(Strings S) {
        return super.sum_to_string(S);
    }

    @Override
    public Itypes sum(Itypes t) {
        return super.sum(t);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof binary) {
            var other = (binary) obj;
            return other.getBinary_value().equals(this.getBinary_value());
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(binary.class);
    }
/**
    @Override
    public Inumber substract_to_Float(floats F) {
        return super.substract_to_Float(F);
    }

    @Override
    public Inumber substract_to_binary(binary B) {
        return super.substract_to_binary(B);
    }

    @Override
    public Inumber substract_to_integer(integers I) {
        return super.substract_to_integer(I);
    }

    @Override
    public Inumber substract(Inumber inumber) {
        return super.substract(inumber);
    }

    @Override
    public Inumber multiply_to_Float(floats F) {
        return super.multiply_to_Float(F);
    }

    @Override
    public Inumber multiply_to_binary(binary B) {
        return super.multiply_to_binary(B);
    }

    @Override
    public Inumber multiply_to_integer(integers I) {
        return super.multiply_to_integer(I);
    }

    @Override
    public Inumber multiply(Inumber inumber) {
        return super.multiply(inumber);
    }
**/
    @Override
    public Strings transform_to_string() {
        return new Strings(this.getBinary_value());
    }
}
