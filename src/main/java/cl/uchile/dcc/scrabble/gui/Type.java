package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public abstract class Type implements Itypes{

    /**
    @Override
    public String toString() {
        return super.toString();
    }
     **/
    @Override
    public Strings transform_to_string() {
        return new Strings(this.toString());
    }
    @Override
    public floats transform_to_float(){
        return null;
    }
    @Override
    public integers transform_to_integers(){
        return null;
    }
    @Override
    public binary transform_to_binary(){
        return null;
    }
    @Override
    public Booleans transform_to_boolean(){
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
    public Strings sum_to_string(Strings S) {
        String result = S.getString_value() + this.toString();
        return new Strings(result);
    }

    @Override
    public binary sum_a_binary(binary B) {
        return null;
    }

    @Override
    public Itypes sum(Itypes t) {
        return null;
    }


}
