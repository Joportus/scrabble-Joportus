package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.binaryFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;

import java.util.Objects;
/**
 * This class represents a Booleans scrabble data type.
 */
public class Booleans extends Type {

    private final boolean bool_value;
    /**
     * Creates a Booleans object.
     *
     * @param bool_value
     *        a boolean value representing the Scrabble's Booleans.
     */
    public Booleans(boolean bool_value) {
        this.bool_value = bool_value;
    }
    /**
     * Returns the Booleans object's bool_value.
     */
    public boolean isBool_value() {
        return bool_value;
    }

    /**
     * Returns an identical copy of this Scrabble's Booleans object.
     */
    public Booleans transform_to_boolean() {
        return booleansFactory.createBooleans(this.isBool_value());
    }
    /**
     * Receives an object as an input, if its equal to this Booleans object, it returns
     * true. Otherwise it returns false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Booleans) {
            var other = (Booleans) obj;
            return other.isBool_value() == this.isBool_value();
        }
        return false;
    }
    /**
     * Returns a string representing the Scrabble's Booleans bool_value.
     */
    @Override
    public String toString() {
        return String.valueOf(this.isBool_value());
    }
    /**
     * Returns this object's hash code.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Booleans.class);
    }
    /**
     * Receives a Scrabble's Booleans as input and returns a Scrabble Booleans representing
     * the result of a logical and operation between the Scrabble Booleans input and this Scrabble's Booleans.
     */
    @Override
    public Itypes bool_and(Booleans B) {
        boolean result_value = B.isBool_value() && this.isBool_value();
        return booleansFactory.createBooleans(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns a Scrabble binary representing
     * the result of a logical and operation between the Scrabble binary input and this Scrabble's Booleans.
     *
     * The binary output is calculated with the bit by bit logical and operation between the binary value
     * and this Booleans value.
     */
    @Override
    public binary binary_and(binary Bin) {
        int l = Bin.getBinary_value().length();
        String str = Bin.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(this.isBool_value()){
            return binaryFactory.createBinary(str);
        }
        else{
            result.append("0".repeat(l));
            String strResult = result.toString();
            return binaryFactory.createBinary(strResult);
        }

    }
    /**
     * Receives an SLogical object and calls it's binary_and method. It uses
     * this Binary object as an input for the binary_and method.
     *
     * Ultimately, it calculates the result the logical and operation between this Scrabble Booleans object and
     * the SLogical input object.
     */
    @Override
    public Itypes and(Itypes L) {
        return L.bool_and(this);
    }
    /**
     * Receives a Scrabble's Booleans as input and returns an SLogical object representing
     * the result of a logical or operation between the Scrabble Booleans input and this Scrabble's Booleans.
     */
    @Override
    public Itypes bool_or(Booleans B) {
        boolean result_value = B.isBool_value() || this.isBool_value();
        return booleansFactory.createBooleans(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns a Scrabble binary representing
     * the result of a logical or operation between the Scrabble binary input and this Scrabble's Booleans.
     *
     * The binary output is calculated with the bit by bit logical or operation between the binary value
     * and this Booleans value.
     */
    @Override
    public Itypes binary_or(binary Bin) {
        int l = Bin.getBinary_value().length();
        String str = Bin.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(!this.isBool_value()){
            return binaryFactory.createBinary(str);
        }
        else{
            result.append("1".repeat(l));
            String strResult = result.toString();
            return binaryFactory.createBinary(strResult);
        }
    }
    /**
     * Receives an SLogical object and calls it's binary_or method. It uses
     * this Binary object as an input for the binary_or method.
     *
     * Ultimately, it calculates the result the logical or operation between this Scrabble Booleans object and
     * the SLogical input object.
     */

    @Override
    public Itypes or(Itypes L) {
        return L.bool_or(this);
    }
    /**
     * Return a Scrabble Booleans object representing the negation of this Booleans value.
     */
    public Booleans negate(){
        boolean result_value = !this.isBool_value();
        return booleansFactory.createBooleans(result_value);
    }

}
