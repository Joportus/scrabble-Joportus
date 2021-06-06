package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

public class binary extends Numbers implements SLogical, Binary_Int{

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
        return this.transform_to_integers().transform_to_float();
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
    public Inumber sum_to_int(integers I) {
        int result_value = I.getInt_value() + this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public floats sum_to_float(floats F) {
        double result_value = F.getFloat_value() + this.transform_to_integers().getInt_value();
        return new floats(result_value);

    }


    @Override
    public binary sum_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() + this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }


    public Binary_Int sum(Binary_Int t) {
        return t.sum_a_binary(this);
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
        return new floats(result_value);
    }

    @Override
    public binary divide_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() / this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.transform_to_integers().getInt_value();
        return new integers(result_value);
    }


    public binary divide(Binary_Int number) {
        return number.divide_a_binary(this);
    }


    @Override
    public floats substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.transform_to_integers().getInt_value();
        return new floats(result_value);
    }

    @Override
    public binary substract_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() - this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Inumber substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.transform_to_integers().getInt_value();
        return new integers(result_value);
    }


    public binary substract(Binary_Int number) {
        return number.substract_to_binary(this);
    }

    @Override
    public floats multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.transform_to_integers().getInt_value();
        return new floats(result_value);
    }

    @Override
    public binary multiply_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() * this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    @Override
    public Int_Float multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.transform_to_integers().getInt_value();
        return new integers(result_value);
    }


    public binary multiply(Binary_Int number) {
        return number.multiply_to_binary(this);
    }

    @Override
    public Strings transform_to_string() {
        return new Strings(this.getBinary_value());
    }

    @Override
    public SLogical bool_and(Booleans B) {
        int l = this.getBinary_value().length();
        String str = this.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(B.isBool_value()){
            return new binary(str);
        }
        else{
            result.append("0".repeat(l));
            String strResult = result.toString();
            return new binary(strResult);
        }
    }

    @Override
    public SLogical binary_and(binary Bin) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int l1 = this.getBinary_value().length();
        int l2 = Bin.getBinary_value().length();
        int max_length = java.lang.Math.max(l1, l2);
        int n1 = this.transform_to_integers().getInt_value();
        int n2 = Bin.transform_to_integers().getInt_value();

        if(n1 < 0){
            while(l1 < max_length){
                s1.append("1");
                l1 ++;
            }
        }
        if(n1 >= 0){
            while(l1 < max_length){
                s1.append("0");
                l1 ++;
            }
        }
        if(n2 < 0){
            while(l2 < max_length){
                s2.append("1");
                l2 ++;
            }
        }
        if(n2 >= 0){
            while(l2 < max_length){
                s2.append("0");
                l2 ++;
            }
        }

        s1.append(this.getBinary_value());
        s2.append(Bin.getBinary_value());
        String binary_value1 = s1.toString();
        String binary_value2 = s2.toString();

        for(int i = 0; i < max_length; i++){
            if(binary_value1.charAt(i) != binary_value2.charAt(i)){
                result.append("0");
            }
            else if((binary_value1.charAt(i) == binary_value2.charAt(i)) && binary_value1.charAt(i) == '1'){
                result.append("1");
            }
            else {
                result.append("0");
            }
        }
        String resultStr = result.toString();
        return new binary(resultStr);
    }

    @Override
    public SLogical and(SLogical L) {
        return L.binary_and(this);
    }

    @Override
    public SLogical bool_or(Booleans B) {
        int l = this.getBinary_value().length();
        String str = this.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(!B.isBool_value()){
            return new binary(str);
        }
        else{
            result.append("1".repeat(l));
            String strResult = result.toString();
            return new binary(strResult);
        }
    }

    @Override
    public SLogical binary_or(binary Bin) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int l1 = this.getBinary_value().length();
        int l2 = Bin.getBinary_value().length();
        int max_length = java.lang.Math.max(l1, l2);
        int n1 = this.transform_to_integers().getInt_value();
        int n2 = Bin.transform_to_integers().getInt_value();

        if(n1 < 0){
            while(l1 < max_length){
                s1.append("1");
                l1 ++;
            }
        }
        if(n1 >= 0){
            while(l1 < max_length){
                s1.append("0");
                l1 ++;
            }
        }
        if(n2 < 0){
            while(l2 < max_length){
                s2.append("1");
                l2 ++;
            }
        }
        if(n2 >= 0){
            while(l2 < max_length){
                s2.append("0");
                l2 ++;
            }
        }

        s1.append(this.getBinary_value());
        s2.append(Bin.getBinary_value());
        String binary_value1 = s1.toString();
        String binary_value2 = s2.toString();

        for(int i = 0; i < max_length; i++){

            if(binary_value1.charAt(i) == '1' || binary_value2.charAt(i) == '1'){
                result.append("1");
            }
            else {
                result.append("0");
            }
        }
        String resultStr = result.toString();
        return new binary(resultStr);
    }

    @Override
    public SLogical or(SLogical L) {
        return L.binary_or(this);
    }
    public binary negate(){
        int l = this.getBinary_value().length();
        String str = this.getBinary_value();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < l; i++){
            if(str.charAt(i) == '1'){
                result.append("0");
            }
            else{
                result.append("1");
            }
        }
        String result_value = result.toString();
        return new binary(result_value);
    }
}
