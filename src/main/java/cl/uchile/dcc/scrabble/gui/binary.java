package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * This class represents a binary scrabble data type.
 */
public class binary extends Type implements SLogical, Binary_Int, Inumber {


    private String binary_value;

    /**
     * Creates a new binary number.
     *
     * @param binary_value
     *        A binary number in string format.
     */
    public binary(String binary_value){
        this.binary_value = binary_value;
    }

    /**
     * Returns the Binary number string value.
     */
    public String getBinary_value() {
        return binary_value;
    }

    /**
     * Returns the  Scrabble binary number's String value.
     */
    @Override
    public String toString() {
        return this.getBinary_value();
    }


    /**
     * Returns the transformation of a Scrabble's binary number to a
     * Scrabble's float number.
     */
    @Override
    public floats transform_to_float() {
        return this.transform_to_integers().transform_to_float();
    }

    /**
     * Returns the transformation of a Scrabble binary number to a
     * Scrabble integer number.
     */
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

    /**
     * returns a Scrabble binary number identical to the initial binary value
     */
    @Override
    public binary transform_to_binary() {
        return new binary(this.getBinary_value());
    }

    /**
     * Receives a Scrabble integer and returns the result of the
     * sum of the scrabble binary plus the Scrabble integer.
     */
    @Override
    public Inumber sum_to_int(integers I) {
        int result_value = I.getInt_value() + this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    /**
     * Receives a Scrabble float and returns the result of the
     * sum of the scrabble binary plus the Scrabble float.
     */
    @Override
    public Inumber sum_to_float(floats F) {
        double result_value = F.getFloat_value() + this.transform_to_integers().getInt_value();
        return new floats(result_value);

    }

    /**
     * Receives a Scrabble binary and returns the result of the
     * sum of the scrabble binary plus the other scrabble binary.
     */
    @Override
    public Binary_Int sum_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() + this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    /**
     * Receives a Binary_Int object and calls it's sum_a_binary method. It uses
     * this Binary object as an input for the sum_a_binary method.
     *
     * Ultimately, it calculates the result of the Binary_Int input added to this Binary object.
     */
    public Binary_Int sum(Binary_Int t) {
        return t.sum_a_binary(this);
    }

    /**
     * Receives an object as an input, if its equal to this binary object, it returns
     * true. Otherwise it returns false
     */
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

    /**
     * Returns this object's hash code.
     */
    @Override
    public int hashCode(){
        return Objects.hash(binary.class);
    }

    /**
     * Receives a Scrabble's float as input and returns the
     * result of the Scrabble's float divided by this Scrabble's binary.
     */
    @Override
    public Inumber divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.transform_to_integers().getInt_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns the result
     * of the Scrabble's binary divided by this Scrabble's binary.
     */
    @Override
    public binary divide_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() / this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives a Scrabble's integer as input and returns the result
     * of the Scrabble's integer divided by this Scrabble's binary.
     */
    @Override
    public Inumber divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.transform_to_integers().getInt_value();
        return new integers(result_value);
    }

    /**
     * Receives a Binary_Int object as input and calls it's divide_a_binary method. It uses
     * this Binary object as an input for the divide_a_binary method.
     *
     * Ultimately, it calculates the result of this binary object divided by the Binary_Int.
     */

    public Binary_Int divide(Binary_Int number) {
        return number.divide_a_binary(this);
    }

    /**
     * Receives a Scrabble's float as input and returns the result
     * of the Scrabble's float minus this Scrabble's binary.
     */
    @Override
    public floats substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.transform_to_integers().getInt_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns the result
     * of the Scrabble's binary minus this Scrabble's binary.
     */
    @Override
    public binary substract_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() - this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives a Scrabble's integer as input and returns the result
     * of the Scrabble's integer minus this Scrabble's binary.
     */
    @Override
    public Inumber substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.transform_to_integers().getInt_value();
        return new integers(result_value);
    }

    /**
     * Receives a Binary_Int object and calls it's substract_to_binary method. It uses
     * this Binary object as an input for the substract_to_binary method.
     *
     * Ultimately, it calculates the result of this binary object subtracted by the Binary_Int.
     */
    public Binary_Int substract(Binary_Int number) {
        return number.substract_to_binary(this);
    }
    /**
     * Receives a Scrabble's float as input and returns the result
     * of the Scrabble's float multiplied by this Scrabble's binary.
     */
    @Override
    public floats multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.transform_to_integers().getInt_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns the result
     * of the Scrabble's binary multiplied by this Scrabble's binary.
     */
    @Override
    public binary multiply_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() * this.transform_to_integers().getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives a Scrabble's integer as input and returns the result
     * of the Scrabble's float multiplied by this Scrabble's binary.
     */
    @Override
    public Int_Float multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.transform_to_integers().getInt_value();
        return new integers(result_value);
    }

    /**
     * Receives a Binary_Int object and calls this objects substract_to_binary method. It uses
     * this Binary object as an input for the substract_to_binary method.
     */
    public Binary_Int multiply(Binary_Int number) {
        return number.multiply_to_binary(this);
    }

    /**
     * Returns the Scrabble String representation of this Scrabble binary number
     */
    @Override
    public Strings transform_to_string() {
        return new Strings(this.getBinary_value());
    }
    /**
     * Receives a Scrabble's binary as input and returns a Scrabble binary representing
     * the result of a logical and operation between the Scrabble binary input and this Scrabble's binary.
     *
     * The binary output is calculated with the bit by bit logical and operation between the binary value
     * and this binary value.
     */
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
    /**
     * Receives a Scrabble's binary as input and returns a Scrabble binary representing
     * the result of a logical and operation between the Scrabble binary input and this Scrabble's binary.
     *
     * The binary output is calculated with the bit by bit logical and operation between the binary value
     * and this binary value.
     */
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
    /**
     * Receives an SLogical object and calls it's binary_and method. It uses
     * this Binary object as an input for the binary_and method.
     *
     * Ultimately, it calculates the result the logical and operation between this Scrabble binary object and
     * the SLogical input object.
     */
    @Override
    public SLogical and(SLogical L) {
        return L.binary_and(this);
    }
    /**
     * Receives a Scrabble's boolean as input and returns a Scrabble binary representing
     * the result of a logical or operation between the Scrabble boolean input and this Scrabble's binary.
     *
     * The binary output is calculated with the bit by bit logical or operation between the boolean value
     * and this binary value.
     */
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
    /**
     * Receives a Scrabble's binary as input and returns a Scrabble binary representing
     * the result of a logical or operation between the Scrabble binary input and this Scrabble's binary.
     *
     * The binary output is calculated with the bit by bit logical or operation between the binary value
     * and this binary value.
     */
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
    /**
     * Receives an SLogical object and calls it's binary_or method. It uses
     * this Binary object as an input for the binary_or method.
     *
     * Ultimately, it calculates the result the logical or operation between this Scrabble binary object and
     * the SLogical input object.
     */
    @Override
    public SLogical or(SLogical L) {
        return L.binary_or(this);
    }

    /**
     * Return a Scrabble binary object representing the bit by bit negation of this binary object's value.
     */
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
