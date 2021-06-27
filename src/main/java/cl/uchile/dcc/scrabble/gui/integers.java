package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

import static java.lang.Math.abs;

/**
 * This class represents an integers scrabble data type.
 */
public class integers extends Type{

    private int int_value;
    /**
     * Creates a new integers object.
     *
     * @param int_value
     *        an int number representing the integers value.
     */
    public integers(int int_value){
        this.int_value = int_value;
    }

    /**
     * returns this object's int_value
     */
    public int getInt_value() {
        return int_value;
    }

    /**
     * Returns a string representing the Scrabble's integer's float_value.
     */
    @Override
    public String toString() {
        return String.valueOf(this.getInt_value());
    }

    /**
     * Returns the transformation of this Scrabble's integers number to a
     * Scrabble's float number.
     */
    @Override
    public floats transform_to_float() {
        return new floats(this.getInt_value());
    }


    /**
     * Returns an exact copy of the integers object.
     *
     * This is because it transforms integers to integers, which gives
     * you an object containing the same information.
     */
    @Override
    public integers transform_to_integers() {
        return new integers(this.getInt_value());
    }

    /**
     * Receives a Scrabble integer and returns the integers result of the
     * sum of this scrabble's integer plus the input Scrabble integer.
     */
    @Override
    public Itypes sum_to_int(integers I) {
        int result_value = I.getInt_value() + this.getInt_value();
        return new integers(result_value);
    }
    /**
     * Receives a Scrabble float and returns the floats result of the
     * sum of this scrabble's float plus the Scrabble's integer.
     */
    @Override
    public Itypes sum_to_float(floats F) {
        double result_value = F.getFloat_value() + this.getInt_value();
        return new floats(result_value);
    }
    /**
     * Receives a Scrabble binary and returns the binary result of the
     * sum of this scrabble's integer plus the Scrabble's binary.
     */
    @Override
    public Itypes sum_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() + this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives an Inumber object and calls it's sum_to_int method. It uses
     * this integers object as an input for sum_to_int method.
     *
     * Ultimately, it calculates the result of the Inumber input added to this integers object.
     */

    @Override
    public Itypes sum(Itypes t) {
        return t.sum_to_int(this);
    }

    /**
     * Returns the transformation of this Scrabble's integers object to a
     * Scrabble's binary object.
     */

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
    private static String positive_intToBinary(int n){

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
    private static String twosComplement(String string){
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
    /**
     * Returns this object's hash code.
     */
    @Override
    public int hashCode(){
        return Objects.hash(integers.class);
    }

    /**
     * Receives an object as an input, if its equal to this integers object, it returns
     * true. Otherwise it returns false
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof integers) {
            var other = (integers) obj;
            return other.getInt_value() == this.getInt_value();
        }
        return false;
    }

    /**
     * Receives a Scrabble float and returns the floats result of the
     * subtraction between the scrabble's float minus this Scrabble's integer.
     */
    @Override
    public floats substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.getInt_value();
        return new floats(result_value);
    }

    /**
     * Receives a Scrabble binary and returns the binary result of the
     * subtraction between the scrabble's binary minus this Scrabble's integer.
     */
    @Override
    public binary substract_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() - this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    /**
     * Receives a Scrabble integer and returns the integers result of the
     * subtraction between the scrabble's integer input minus this Scrabble's integer.
     */
    @Override
    public Itypes substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.getInt_value();
        return new integers(result_value);
    }

    /**
     * Receives an Inumber object and calls it's substract_to_integer method. It uses
     * this integers object as an input for substract_to_integer method.
     *
     * Ultimately, it calculates the result of this integers object minus the Inumber input.
     */

    @Override
    public Itypes substract(Itypes inumber) {
        return inumber.substract_to_integer(this);
    }

    /**
     * Receives a Scrabble float and returns the floats result of the
     * multiplication between the scrabble's float and this Scrabble's integer.
     */
    @Override
    public floats multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.getInt_value();
        return new floats(result_value);
    }

    /**
     * Receives a Scrabble binary and returns the binary result of the
     * multiplication between the scrabble's binary and this Scrabble's integer.
     */
    @Override
    public Itypes multiply_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() * this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    /**
     * Receives a Scrabble integer and returns the integers result of the
     * multiplication between the scrabble's integer input and this Scrabble's integer.
     */
    @Override
    public Itypes multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.getInt_value();
        return new integers(result_value);
    }
    /**
     * Receives an Inumber object and calls it's multiply_to_integer method. It uses
     * this integers object as an input for multiply_to_integer method.
     *
     * Ultimately, it calculates the result of this integers object multiplied to the Inumber input.
     */

    @Override
    public Itypes multiply(Itypes inumber) {
        return inumber.multiply_to_integer(this);
    }

    /**
     * Receives a Scrabble float and returns the floats result of the
     * of the Scrabble's float divided by this Scrabble's integer.
     */
    @Override
    public Itypes divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.getInt_value();
        return new floats(result_value);
    }

    /**
     * Receives a Scrabble binary and returns the binary result of the
     * of the Scrabble's binary divided by this Scrabble's integer.
     */
    @Override
    public Itypes divide_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() / this.getInt_value();
        integers result = new integers(result_value);
        return result.transform_to_binary();
    }

    /**
     * Receives a Scrabble integer and returns the integers result of the
     * of the Scrabble's integer input divided by this Scrabble's integer.
     */
    @Override
    public Itypes divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.getInt_value();
        return new integers(result_value);
    }

    /**
     * Receives an Inumber object and calls it's divide_a_integer method. It uses
     * this integers object as an input for divide_a_integer method.
     *
     * Ultimately, it calculates the result of this integers object divided by the Inumber input.
     */

    @Override
    public Itypes divide(Itypes inumber) {
        return inumber.divide_a_integer(this);
    }
}
