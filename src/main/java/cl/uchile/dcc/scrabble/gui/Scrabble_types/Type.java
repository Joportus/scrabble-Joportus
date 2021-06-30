package cl.uchile.dcc.scrabble.gui.Scrabble_types;
import cl.uchile.dcc.scrabble.gui.Itypes;


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
        return new NullType();
    }

    @Override
    public Itypes binary_and(binary bin) {
        return new NullType();
    }

    @Override
    public Itypes bool_or(Booleans b) {
        return new NullType();
    }

    @Override
    public Itypes binary_or(binary bin) {
        return new NullType();
    }

    @Override
    public Itypes transform_to_integers() {
        return new NullType();
    }
    @Override
    public Itypes transform_to_binary() {
        return new NullType();
    }

    @Override
    public Itypes transform_to_boolean() {
        return new NullType();
    }
    @Override
    public Itypes sum_a_binary(binary B) {
        return new NullType();
    }

    @Override
    public Itypes multiply_to_binary(binary B) {
        return new NullType();
    }

    @Override
    public Itypes divide_a_binary(binary B) {
        return new NullType();
    }

    @Override
    public Itypes substract_to_binary(binary B) {
        return new NullType();
    }

    @Override
    public Itypes substract_to_Float(floats F) {
        return new NullType();
    }

    @Override
    public Itypes substract_to_integer(integers I) {
        return new NullType();
    }

    @Override
    public Itypes multiply_to_Float(floats F) {
        return new NullType();
    }

    @Override
    public Itypes multiply_to_integer(integers I) {
        return new NullType();
    }

    @Override
    public Itypes divide_a_Float(floats F) {
        return new NullType();
    }

    @Override
    public Itypes divide_a_integer(integers I) {
        return new NullType();
    }

    @Override
    public Itypes sum_to_int(integers I) {
        return new NullType();
    }

    @Override
    public Itypes sum_to_float(floats F) {
        return new NullType();
    }

    @Override
    public Itypes transform_to_float() {
        return new NullType();
    }

    @Override
    public Itypes and(Itypes L) {
        return new NullType();
    }

    @Override
    public Itypes or(Itypes L) {
        return new NullType();
    }

    @Override
    public Itypes multiply(Itypes inumber) {
        return new NullType();
    }

    @Override
    public Itypes sum(Itypes inumber) {
        return new NullType();
    }

    @Override
    public Itypes substract(Itypes inumber) {
        return new NullType();
    }

    @Override
    public Itypes divide(Itypes inumber) {
        return new NullType();
    }

    @Override
    public Itypes negate() {
        return new NullType();
    }

    @Override
    public Itypes eval() {
        return this;
    }
}
