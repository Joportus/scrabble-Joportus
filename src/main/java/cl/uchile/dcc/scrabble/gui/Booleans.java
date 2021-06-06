package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class Booleans extends Type implements SLogical{

    private boolean bool_value;

    public Booleans(boolean bool_value) {
        this.bool_value = bool_value;
    }

    public boolean isBool_value() {
        return bool_value;
    }

    @Override
    public Strings transform_to_string() {
        return super.transform_to_string();
    }


    public Booleans transform_to_boolean() {
        return new Booleans(this.isBool_value());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Booleans) {
            var other = (Booleans) obj;
            return other.isBool_value() == this.isBool_value();
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(Booleans.class);
    }

    @Override
    public SLogical bool_and(Booleans B) {
        boolean result_value = B.isBool_value() && this.isBool_value();
        return new Booleans(result_value);
    }

    @Override
    public SLogical binary_and(binary Bin) {
        int l = Bin.getBinary_value().length();
        String str = Bin.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(this.isBool_value()){
            return new binary(str);
        }
        else{
            result.append("0".repeat(l));
            String strResult = result.toString();
            return new binary(strResult);
        }

    }

    @Override
    public SLogical and(SLogical L) {
        return L.bool_and(this);
    }

    @Override
    public SLogical bool_or(Booleans B) {
        boolean result_value = B.isBool_value() || this.isBool_value();
        return new Booleans(result_value);
    }

    @Override
    public SLogical binary_or(binary Bin) {
        int l = Bin.getBinary_value().length();
        String str = Bin.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(!this.isBool_value()){
            return new binary(str);
        }
        else{
            result.append("1".repeat(l));
            String strResult = result.toString();
            return new binary(strResult);
        }
    }

    @Override
    public SLogical or(SLogical L) {
        return L.bool_or(this);
    }

    public Booleans negate(){
        boolean result_value = !this.isBool_value();
        return new Booleans(result_value);
    }

}
