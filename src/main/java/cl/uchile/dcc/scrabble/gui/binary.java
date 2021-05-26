package cl.uchile.dcc.scrabble.gui;

public class binary extends Numbers{
    private String binary_value;
    public binary(String binary_value){
        this.binary_value = binary_value;
    }

    public String getBinary_value() {
        return binary_value;
    }

    @Override
    public String toString() {
        return this.getBinary_value();
    }
/**
    @Override
    public floats transform_to_float() {
        return super.transform_to_float();
    }

    @Override
    public integers transform_to_integers() {
        return super.transform_to_integers();
    }
**/
    @Override
    public binary transform_to_binary() {
        return new binary(this.getBinary_value());
    }

}
