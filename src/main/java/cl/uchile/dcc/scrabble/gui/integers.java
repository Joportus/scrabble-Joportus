package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class integers extends Numbers{

    private int int_value;
    public integers(int int_value){
        this.int_value = int_value;
    }

    public int getInt_value() {
        return int_value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getInt_value());
    }

    @Override
    public floats transform_to_float() {
        return new floats(this.getInt_value());
    }

    @Override
    public integers transform_to_integers() {
        return new integers(this.getInt_value());
    }

    @Override
    public Itypes sum_to_int(integers I) {
        int result_value = I.getInt_value() + this.getInt_value();
        integers result = new integers(result_value);
        return result;
    }

    @Override
    public Itypes sum_to_float(floats F) {
        double result_value = F.getFloat_value() + this.getInt_value();
        floats result = new floats(result_value);
        return result;
    }

    @Override
    public Itypes sum(Itypes t) {
        return t.sum_to_int(this);
    }


    /**
    @Override
    public binary transform_to_binary() {
        return super.transform_to_binary();
    }
**/
    @Override
    public int hashCode(){
        return Objects.hash(integers.class);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof integers) {
            var other = (integers) obj;
            return other.getInt_value() == this.getInt_value();
        }
        return false;
    }

    @Override
    public Inumber substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.getInt_value();
        return new floats(result_value);
    }



    /**
    @Override
    public Inumber substract_to_binary(binary B) {
        return super.substract_to_binary(B);
    }
**/
    @Override
    public Inumber substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.getInt_value();
        return new integers(result_value);
    }

    @Override
    public Inumber substract(Inumber inumber) {
        return inumber.substract_to_integer(this);
    }

    @Override
    public Inumber multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.getInt_value();
        return new floats(result_value);
    }
/**
    @Override
    public Inumber multiply_to_binary(binary B) {
        return super.multiply_to_binary(B);
    }
**/
    @Override
    public Inumber multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.getInt_value();
        return new integers(result_value);
    }

    @Override
    public Inumber multiply(Inumber inumber) {
        return inumber.multiply_to_integer(this);
    }

    @Override
    public Inumber divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.getInt_value();
        return new floats(result_value);
    }
    /**
    @Override
    public Inumber divide_a_binary(binary B) {
        return super.divide_a_binary(B);
    }
**/
    @Override
    public Inumber divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.getInt_value();
        return new integers(result_value);
    }

    @Override
    public Inumber divide(Inumber inumber) {
        return inumber.divide_a_integer(this);
    }
}
