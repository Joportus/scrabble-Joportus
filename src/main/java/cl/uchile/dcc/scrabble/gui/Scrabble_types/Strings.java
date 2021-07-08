package cl.uchile.dcc.scrabble.gui.Scrabble_types;
import cl.uchile.dcc.scrabble.gui.Itypes;

import java.util.Objects;

/**
 * This class represents a Strings scrabble data type.
 */
public class Strings extends Type {


    private final String string_value;

    /**
     * Creates a Booleans object.
     *
     * @param string_value
     *        a String value representing the Scrabble's Strings.
     */
    public Strings(String string_value){
        this.string_value = string_value;
    }
    /**
     * Returns the Strings object's string_value.
     */
    public String getString_value() {
        return string_value;
    }

    /**
     * Returns the Strings object's string_value.
     */
    @Override
    public String toString() {
        return this.getString_value();
    }
    /**
     * Returns this object's hash code.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Strings.class);
    }
    /**
     * Receives an object as an input, if its equal to this Strings object, it returns
     * true. Otherwise it returns false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Strings) {
            var other = (Strings) obj;
            return other.getString_value().equals(this.getString_value());
        }
        return false;
    }

    /**
     * Receives an Itypes object and calls it's sum_to_string method. It uses
     * this Strings object as an input for sum_to_string method.
     *
     * Ultimately, it calculates the result of theString value
     * concatenated to this objects toString() representation.
     */
    @Override
    public Itypes sum(Itypes t) {
        return t.sum_to_string(this);
    }
}
