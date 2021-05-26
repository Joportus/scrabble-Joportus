package cl.uchile.dcc.scrabble.gui;

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


}
