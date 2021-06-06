package cl.uchile.dcc.scrabble.gui;
import java.util.Objects;

public class Strings extends Type{


    private String string_value;

    public Strings(String string_value){
        this.string_value = string_value;
    }

    public String getString_value() {
        return string_value;
    }

    @Override
    public String toString() {
        return this.getString_value();
    }

    @Override
    public int hashCode(){
        return Objects.hash(Strings.class);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Strings) {
            var other = (Strings) obj;
            return other.getString_value().equals(this.getString_value());
        }
        return false;
    }


    public Strings sum(Itypes t) {
        return t.sum_to_string(this);
    }
}
