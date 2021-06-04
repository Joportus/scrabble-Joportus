package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class binary extends Numbers implements SLogical{
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


    @Override
    public floats transform_to_float() {
        return super.transform_to_float();
    }

    @Override
    public integers transform_to_integers() {
        String binary = this.getBinary_value();
        if (bitToInt(binary.charAt(0)) == 0) {
            return new integers(positiveBinToInt(binary));
        }
        else{
            return new integers(negativeBinaryToInt(binary));
        }
    }

    private int negativeBinaryToInt(String binary){
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++){
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0);
        }
        return w;
    }

    private int positiveBinToInt(String binary){
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++){
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i));
        }
        return w;
    }

    private int bitToInt(char bit){
        return bit == '0' ? 0 : 1;
    }

    @Override
    public binary transform_to_binary() {
        return new binary(this.getBinary_value());
    }

    @Override
    public Itypes sum_to_int(integers I) {
        return super.sum_to_int(I);
    }

    @Override
    public Itypes sum_to_float(floats F) {
        return super.sum_to_float(F);
    }

    @Override
    public Strings sum_to_string(Strings S) {
        return super.sum_to_string(S);
    }

    @Override
    public Itypes sum(Itypes t) {
        return super.sum(t);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof binary) {
            var other = (binary) obj;
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            int l1 = this.getBinary_value().length();
            int l2 = other.getBinary_value().length();
            int max_length = java.lang.Math.max(l1, l2);
            int n1 = this.transform_to_integers().getInt_value();
            int n2 = other.transform_to_integers().getInt_value();
            if ((n1 > 0 && n2 < 0) || (n2 > 0 && n1 < 0)){
                return false;
            }
            else if(n1 < 0 && n2 < 0){
                while(l1 < max_length){
                    s1.append("1");
                    l1 ++;
                }
                while(l2 < max_length){
                    s2.append("1");
                    l2 ++;
                }
            }
            while(l1 < max_length){
                s1.append("0");
                l1 ++;
            }
            while(l2 < max_length){
                s2.append("0");
                l2 ++;
            }
            s1.append(this.getBinary_value());
            s2.append(other.getBinary_value());
            String binary_value1 = s1.toString();
            String binary_value2 = s2.toString();
            return binary_value1.equals(binary_value2);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(binary.class);
    }

    @Override
    public Inumber divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.transform_to_integers().getInt_value();
        floats result = new floats(result_value);
        return result.transform_to_integers().transform_to_binary();
    }

    @Override
    public Inumber divide_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() / this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber divide(Inumber inumber) {
        return divide_a_binary(this);
    }


    @Override
    public Inumber substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.transform_to_integers().getInt_value();
        floats result = new floats(result_value);
        return result.transform_to_integers().transform_to_binary();
    }

    @Override
    public Inumber substract_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() - this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber substract(Inumber inumber) {
        return substract_to_binary(this);
    }

    @Override
    public Inumber multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.transform_to_integers().getInt_value();
        floats result = new floats(result_value);
        return result.transform_to_integers().transform_to_binary();
    }

    @Override
    public Inumber multiply_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() * this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber multiply(Inumber inumber) {
        return multiply_to_binary(this);
    }

    @Override
    public Strings transform_to_string() {
        return new Strings(this.getBinary_value());
    }

    @Override
    public SLogical bool_and(Booleans B) {
        return null;
    }

    @Override
    public SLogical binary_and(binary Bin) {
        return null;
    }

    @Override
    public SLogical and(SLogical L) {
        return null;
    }

    @Override
    public SLogical bool_or(Booleans B) {
        return null;
    }

    @Override
    public SLogical binary_or(binary Bin) {
        return null;
    }

    @Override
    public SLogical or(SLogical L) {
        return null;
    }
    public binary negate(binary Bin){
        return null;
    }
}
