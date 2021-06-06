package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

/**
 * This is an abstract class that holds all the common characteristics of all
 * Scrabble data types.
 */
public abstract class Type implements Itypes{


    @Override
    public Strings transform_to_string() {
        return new Strings(this.toString());
    }


    @Override
    public Strings sum_to_string(Strings S) {
        String result = S.getString_value() + this.toString();
        return new Strings(result);
    }



}
