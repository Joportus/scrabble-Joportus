package cl.uchile.dcc.scrabble.gui;

public class floats extends Numbers{
    private double float_value;
    public floats(double float_value){
        this.float_value = float_value;
    }

    public double getFloat_value() {
        return float_value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getFloat_value());
    }

    @Override
    public floats transform_to_float() {
        return new floats(this.getFloat_value());
    }


}
