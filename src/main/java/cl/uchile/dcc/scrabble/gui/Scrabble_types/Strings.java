package cl.uchile.dcc.scrabble.gui.Scrabble_types;
import cl.uchile.dcc.scrabble.gui.Itypes;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * This class represents a Strings scrabble data type.
 */
public class Strings extends Type implements Comparable<Itypes>{


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

    /**
     * Receives a Strings s object as input and it compares that Strings value with this objects
     * Strings value lexicographically. If both Strings objects are equal it returns 0. The result is
     * positive is s is lexicographically greater than this object and the result is negative otherwise.
     * It uses the java compareTo() method.
     */
    @Override
    public int compareToString(Strings s) {
        return s.getString_value().compareTo(this.getString_value());
    }

    /**
     * Receives an Itypes object and calls it's compareToString method. It uses
     * this Strings object as an input for compareToString method.
     *
     * Ultimately, it calculates the result of the comparison of this Strings object and the Itypes input.
     */
    @Override
    public int compareTo(@NotNull Itypes o) {
        return o.compareToString(this);
    }
}
