package cl.uchile.dcc.scrabble.gui;

public class integers extends Numbers{
    private int int_value;
    public integers(int int_value){
        this.int_value = int_value;
    }

    public int getInt_value() {
        return int_value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getInt_value());
    }

    @Override
    public floats transform_to_float() {
        return new floats(this.getInt_value());
    }

    @Override
    public integers transform_to_integers() {
        return new integers(this.getInt_value());
    }
/**
    @Override
    public binary transform_to_binary() {
        return super.transform_to_binary();
    }
**/

}
