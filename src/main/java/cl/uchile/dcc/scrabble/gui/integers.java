package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

import static java.lang.Math.abs;

public class integers extends Type implements Binary_Int, Int_Float, Inumber {

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

    @Override
    public Inumber sum_to_int(integers I) {
        int result_value = I.getInt_value() + this.getInt_value();
        return new integers(result_value);
    }

    @Override
    public floats sum_to_float(floats F) {
        double result_value = F.getFloat_value() + this.getInt_value();
        return new floats(result_value);
    }

    @Override
    public binary sum_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() + this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber sum(Inumber t) {
        return t.sum_to_int(this);
    }

    @Override
    public binary transform_to_binary() {
        int i = this.getInt_value();
        int abs_i = abs(i);
        String b = positive_intToBinary(abs_i);
        if(i < 0){
            b = twosComplement(b);
        }
        return new binary(b);

    }
    static String positive_intToBinary(int n){

        StringBuilder binaryNumString = new StringBuilder();
        binaryNumString.append("0");
        int[] binaryNumArray = new int[32];
        int i = 0;
        while(n > 0){
            binaryNumArray[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--){
            binaryNumString.append(binaryNumArray[j]);
        }
        return binaryNumString.toString();
    }
    static String twosComplement(String string){
        StringBuilder str = new StringBuilder();
        str.append(string);
        int n = str.length();
        int i;
        for (i = n - 1; i >= 0; i--){
            if (str.charAt(i) == '1'){
                break;
            }
        }
        if (i == -1){
            return "1" + str;
        }
        for (int k = i - 1; k >= 0; k--){
            if (str.charAt(k) == '1'){
                str.replace(k, k + 1, "0");
            }
            else{
                str.replace(k, k + 1, "1");
            }
        }

        return str.toString();
    }

    @Override
    public int hashCode(){
        return Objects.hash(integers.class);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof integers) {
            var other = (integers) obj;
            return other.getInt_value() == this.getInt_value();
        }
        return false;
    }

    @Override
    public floats substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.getInt_value();
        return new floats(result_value);
    }


    @Override
    public binary substract_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() - this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.getInt_value();
        return new integers(result_value);
    }

    @Override
    public Inumber substract(Inumber inumber) {
        return inumber.substract_to_integer(this);
    }

    @Override
    public floats multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.getInt_value();
        return new floats(result_value);
    }

    @Override
    public binary multiply_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() * this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Int_Float multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.getInt_value();
        return new integers(result_value);
    }
    @Override
    public Inumber multiply(Inumber inumber) {
        return inumber.multiply_to_integer(this);
    }

    @Override
    public Inumber divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.getInt_value();
        return new floats(result_value);
    }

    @Override
    public binary divide_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() / this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.getInt_value();
        return new integers(result_value);
    }

    @Override
    public Inumber divide(Inumber inumber) {
        return inumber.divide_a_integer(this);
    }
}
