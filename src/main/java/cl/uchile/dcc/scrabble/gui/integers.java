package cl.uchile.dcc.scrabble.gui;

public class integers extends Numbers{
    private int int_value;
    public integers(int int_value){
        this.int_value = int_value;
    }

    public int getInt_value() {
        return int_value;
    }
    Strings transform_to_string(){
        Strings transformed_integer = new Strings(this.toString());
        return transformed_integer;
    }

}
