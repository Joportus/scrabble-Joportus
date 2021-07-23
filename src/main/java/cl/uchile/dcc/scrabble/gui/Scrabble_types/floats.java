package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.floatsFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * This class represents a floats scrabble data type.
 */
public class floats extends Type implements SNumber, Comparable<SNumber> {

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
     * @return
     */
    @Override
    public Itypes transform_to_float() {
        return floatsFactory.createFloats(this.getFloat_value());
    }
    /**
     * Receives a Scrabble integer and returns the floats result of the
     * sum of this scrabble's float plus the Scrabble integer.
     */
    @Override
    public Itypes sum_to_int(integers I) {
        double result_value = this.getFloat_value() + I.getInt_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble float and returns the floats result of the
     * sum of this scrabble's float plus the input Scrabble float.
     */
    @Override
    public Itypes sum_to_float(floats F) {
        double result_value = this.getFloat_value() + F.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's sum_to_float method. It uses
     * this float object as an input for sum_to_float method.
     *
     * Ultimately, it calculates the result of the Inumber input added to this float object.
     */

    @Override
    public Itypes sum(Itypes t) {
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
    public Itypes substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble's integer as input and returns the floats result of the
     * subtraction of the input scrabble's integer minus this scrabble's float.
     */
    @Override
    public Itypes substract_to_integer(integers I) {
        double result_value = I.getInt_value() - this.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's substract_to_float method. It uses
     * this float object as an input for substract_to_float method.
     *
     * Ultimately, it calculates the result of this floats object subtracted to the Inumber input.
     */

    @Override
    public Itypes substract(Itypes inumber) {
        return inumber.substract_to_Float(this);
    }

    /**
     * Receives a Scrabble float and returns the floats result of the
     * multiplication of this scrabble's float and input Scrabble float.
     */
    @Override
    public Itypes multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble integer and returns the floats result of the
     * multiplication of this scrabble's float and input Scrabble integer.
     */
    @Override
    public Itypes multiply_to_integer(integers I) {
        double result_value = I.getInt_value() * this.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's multiply_to_float method. It uses
     * this float object as an input for multiply_to_float method.
     *
     * Ultimately, it calculates the result of this floats object multiplied to the Inumber input.
     */

    @Override
    public Itypes multiply(Itypes inumber) {
        return inumber.multiply_to_Float(this);
    }
    /**
     * Receives a Scrabble float as input and returns the floats result of the
     * the input scrabble's float divided by this scrabble's float.
     */
    @Override
    public Itypes divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble integer as input and returns the floats result of the
     * the input scrabble's integer divided by this scrabble's float.
     */
    @Override
    public Itypes divide_a_integer(integers I) {
        double result_value = I.getInt_value() / this.getFloat_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives an Inumber object and calls it's divide_a_Float method. It uses
     * this float object as an input for divide_a_Float method.
     *
     * Ultimately, it calculates the result of this floats object divided by the the Inumber input.
     */

    @Override
    public Itypes divide(Itypes itype) {
        return itype.divide_a_Float(this);
    }


    @Override
    public int compareTo(@NotNull SNumber o) {
        return o.compareToFloat(this);
    }
    @Override
    public int compareToInt(integers i){
        return Double.compare(i.getInt_value(), this.getFloat_value());
    }
    @Override
    public int compareToFloat(floats f){
        return Double.compare(f.getFloat_value(), this.getFloat_value());
    }

    @Override
    public int compareToBinary(binary b) {
        return Double.compare(b.transform_to_integers().getInt_value(), this.getFloat_value());
    }


}
