package cl.uchile.dcc.scrabble.gui.Scrabble_types;
import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.*;


/**
 * This is an abstract class that holds all the common characteristics of all
 * Scrabble data types.
 */
public abstract class Type implements Itypes {


    /**
     * Returns the Scrabble String representation of this object.
     */
    @Override
    public Strings transform_to_string() {
        return new Strings(this.toString());
    }


    @Override
    public Strings sum_to_string(Strings S) {
        String result = S.getString_value() + this.toString();
        return new Strings(result);
    }

    @Override
    public Itypes bool_and(Booleans b) {
        return null;
    }

    @Override
    public Itypes binary_and(binary bin) {
        return null;
    }

    @Override
    public Itypes bool_or(Booleans b) {
        return null;
    }

    @Override
    public Itypes binary_or(binary bin) {
        return null;
    }

    @Override
    public integers transform_to_integers() {
        return null;
    }

    @Override
    public binary transform_to_binary() {
        return null;
    }

    @Override
    public Booleans transform_to_boolean() {
        return null;
    }
    @Override
    public Itypes sum_a_binary(binary B) {
        return null;
    }

    @Override
    public Itypes multiply_to_binary(binary B) {
        return null;
    }

    @Override
    public Itypes divide_a_binary(binary B) {
        return null;
    }

    @Override
    public Itypes substract_to_binary(binary B) {
        return null;
    }

    @Override
    public Itypes substract_to_Float(floats F) {
        return null;
    }

    @Override
    public Itypes substract_to_integer(integers I) {
        return null;
    }

    @Override
    public Itypes multiply_to_Float(floats F) {
        return null;
    }

    @Override
    public Itypes multiply_to_integer(integers I) {
        return null;
    }

    @Override
    public Itypes divide_a_Float(floats F) {
        return null;
    }

    @Override
    public Itypes divide_a_integer(integers I) {
        return null;
    }

    @Override
    public Itypes sum_to_int(integers I) {
        return null;
    }

    @Override
    public Itypes sum_to_float(floats F) {
        return null;
    }

    @Override
    public floats transform_to_float() {
        return null;
    }

    @Override
    public Itypes and(Itypes L) {
        return null;
    }

    @Override
    public Itypes or(Itypes L) {
        return null;
    }

    @Override
    public Itypes multiply(Itypes inumber) {
        return null;
    }

    @Override
    public Itypes sum(Itypes inumber) {
        return null;
    }

    @Override
    public Itypes substract(Itypes inumber) {
        return null;
    }

    @Override
    public Itypes divide(Itypes inumber) {
        return null;
    }

    @Override
    public Itypes negate() {
        return null;
    }

    @Override
    public Itypes eval() {
        return this;
    }
}
