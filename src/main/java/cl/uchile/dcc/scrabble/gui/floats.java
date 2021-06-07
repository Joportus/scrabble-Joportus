package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * This class represents a floats scrabble data type.
 */
public class floats extends Type implements Int_Float, Inumber {

    private final double float_value;
    /**
     * Creates a new floats object.
     *
     * @param float_value
     *        a double number representing the floats value.
     */
    public floats(double float_value){
        this.float_value = float_value;
    }

    /**
     * returns this object's float_value
     */
    public double getFloat_value() {
        return float_value;
    }

    /**
     * Returns a string representing the Scrabble's float's float_value.
     */
    @Override
    public String toString() {
        return String.valueOf(this.getFloat_value());
    }
    /**
     * Returns the transformation of this Scrabble's float number to a
     * Scrabble's float number. (Returns an identical copy of the object).
     */
    @Override
    public floats transform_to_float() {
        return new floats(this.getFloat_value());
    }
    /**
     * Receives a Scrabble integer and returns the floats result of the
     * sum of this scrabble's float plus the Scrabble integer.
     */
    @Override
    public Inumber sum_to_int(integers I) {
        double result_value = this.getFloat_value() + I.getInt_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble float and returns the floats result of the
     * sum of this scrabble's float plus the input Scrabble float.
     */
    @Override
    public Inumber sum_to_float(floats F) {
        double result_value = this.getFloat_value() + F.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's sum_to_float method. It uses
     * this float object as an input for sum_to_float method.
     *
     * Ultimately, it calculates the result of the Inumber input added to this float object.
     */
    @Override
    public Inumber sum(Inumber t) {
        return t.sum_to_float(this);
    }
    /**
     * Returns this object's hash code.
     */
    @Override
    public int hashCode(){
        return Objects.hash(floats.class);
    }

    /**
     * Receives an object as an input, if its equal to this float object, it returns
     * true. Otherwise it returns false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof floats) {
            var other = (floats) obj;
            return other.getFloat_value() == this.getFloat_value();
        }
        return false;
    }
    /**
     * Receives a Scrabble float as input and returns the floats result of the
     * subtraction of the input scrabble's float minus this scrabble's float.
     */
    @Override
    public Inumber substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble's integer as input and returns the floats result of the
     * subtraction of the input scrabble's integer minus this scrabble's float.
     */
    @Override
    public Inumber substract_to_integer(integers I) {
        double result_value = I.getInt_value() - this.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's substract_to_float method. It uses
     * this float object as an input for substract_to_float method.
     *
     * Ultimately, it calculates the result of this floats object subtracted to the Inumber input.
     */
    @Override
    public Inumber substract(Inumber inumber) {
        return inumber.substract_to_Float(this);
    }

    /**
     * Receives a Scrabble float and returns the floats result of the
     * multiplication of this scrabble's float and input Scrabble float.
     */
    @Override
    public Inumber multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble integer and returns the floats result of the
     * multiplication of this scrabble's float and input Scrabble integer.
     */
    @Override
    public Inumber multiply_to_integer(integers I) {
        double result_value = I.getInt_value() * this.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's multiply_to_float method. It uses
     * this float object as an input for multiply_to_float method.
     *
     * Ultimately, it calculates the result of this floats object multiplied to the Inumber input.
     */
    @Override
    public Inumber multiply(Inumber inumber) {
        return inumber.multiply_to_Float(this);
    }
    /**
     * Receives a Scrabble float as input and returns the floats result of the
     * the input scrabble's float divided by this scrabble's float.
     */
    @Override
    public Inumber divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble integer as input and returns the floats result of the
     * the input scrabble's integer divided by this scrabble's float.
     */
    @Override
    public Inumber divide_a_integer(integers I) {
        double result_value = I.getInt_value() / this.getFloat_value();
        return new floats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's divide_a_Float method. It uses
     * this float object as an input for divide_a_Float method.
     *
     * Ultimately, it calculates the result of this floats object divided by the the Inumber input.
     */
    @Override
    public Inumber divide(Inumber inumber) {
        return inumber.divide_a_Float(this);
    }


}
