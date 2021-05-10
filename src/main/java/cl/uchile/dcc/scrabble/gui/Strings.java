package cl.uchile.dcc.scrabble.gui;

public class Strings {
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
    public Strings transform_to_string(){
        return this;
    }


}
