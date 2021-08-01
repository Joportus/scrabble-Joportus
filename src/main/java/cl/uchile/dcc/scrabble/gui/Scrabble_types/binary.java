package cl.uchile.dcc.scrabble.gui.Scrabble_types;

import cl.uchile.dcc.scrabble.gui.*;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.binaryFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.floatsFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * This class represents a binary scrabble data type.
 */
public class binary extends Type implements SNumber, Comparable<Itypes>{


    private final String binary_value;

    /**
     * Creates a new binary object.
     *
     * @param binary_value
     *        A binary number in string format.
     */
    public binary(String binary_value){
        this.binary_value = binary_value;
    }

    /**
     * Returns this Binary object's string value.
     */
    public String getBinary_value() {
        return binary_value;
    }

    /**
     * Returns this  Scrabble binary object's String value.
     */
    @Override
    public String toString() {
        return this.getBinary_value();
    }


    /**
     * Returns the transformation of this Scrabble's binary number to a
     * Scrabble's float number.
     * @return
     */
    @Override
    public Itypes transform_to_float() {
        return this.transform_to_integers().transform_to_float();
    }

    /**
     * Returns the transformation of this Scrabble binary number to a
     * Scrabble integer number.
     * @return
     */
    @Override
    public integers transform_to_integers() {
        String binary = this.getBinary_value();
        if (bitToInt(binary.charAt(0)) == 0) {
            return integersFactory.createIntegers(positiveBinToInt(binary));
        }
        else{
            return integersFactory.createIntegers(negativeBinaryToInt(binary));
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
        return binaryFactory.createBinary(this.getBinary_value());
    }

    /**
     * Receives a Scrabble integer and returns the binary result of the
     * sum of the scrabble binary plus the Scrabble integer.
     */
    @Override
    public Itypes sum_to_int(integers I) {
        int result_value = I.getInt_value() + this.transform_to_integers().getInt_value();
        return integersFactory.createIntegers(result_value);
    }

    /**
     * Receives a Scrabble float and returns the floats result of the
     * sum of the scrabble binary plus the Scrabble float.
     */
    @Override
    public Itypes sum_to_float(floats F) {
        double result_value = F.getFloat_value() + this.transform_to_integers().getInt_value();
        return floatsFactory.createFloats(result_value);

    }

    /**
     * Receives a Scrabble binary and returns the binary result of the
     * sum of the scrabble binary plus the other scrabble binary.
     */
    @Override
    public Itypes sum_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() + this.transform_to_integers().getInt_value();
        integers result = integersFactory.createIntegers(result_value);
        return result.transform_to_binary();
    }

    /**
     * Receives a Binary_Int object and calls it's sum_a_binary method. It uses
     * this Binary object as an input for the sum_a_binary method.
     *
     * Ultimately, it calculates the result of the Binary_Int input added to this Binary object.
     */
    @Override
    public Itypes sum(Itypes t) {
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
     * floats result of the Scrabble's float divided by this Scrabble's binary.
     */
    @Override
    public Itypes divide_a_Float(floats F) {
        double result_value = F.getFloat_value() / this.transform_to_integers().getInt_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns the binary result
     * of the Scrabble's binary divided by this Scrabble's binary.
     */
    @Override
    public binary divide_a_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() / this.transform_to_integers().getInt_value();
        integers result = integersFactory.createIntegers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives a Scrabble's integer as input and returns the integers result
     * of the Scrabble's integer divided by this Scrabble's binary.
     */
    @Override
    public Itypes divide_a_integer(integers I) {
        int result_value = I.getInt_value() / this.transform_to_integers().getInt_value();
        return integersFactory.createIntegers(result_value);
    }

    /**
     * Receives a Binary_Int object as input and calls it's divide_a_binary method. It uses
     * this Binary object as an input for the divide_a_binary method.
     *
     * Ultimately, it calculates the result of this binary object divided by the Binary_Int.
     */

    @Override
    public Itypes divide(Itypes number) {
        return number.divide_a_binary(this);
    }

    /**
     * Receives a Scrabble's float as input and returns the floats result
     * of the Scrabble's float minus this Scrabble's binary.
     */
    @Override
    public floats substract_to_Float(floats F) {
        double result_value = F.getFloat_value() - this.transform_to_integers().getInt_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns the binary result
     * of the Scrabble's binary minus this Scrabble's binary.
     */
    @Override
    public binary substract_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() - this.transform_to_integers().getInt_value();
        integers result = integersFactory.createIntegers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives a Scrabble's integer as input and returns the integers result
     * of the Scrabble's integer minus this Scrabble's binary.
     */
    @Override
    public Itypes substract_to_integer(integers I) {
        int result_value = I.getInt_value() - this.transform_to_integers().getInt_value();
        return integersFactory.createIntegers(result_value);
    }

    /**
     * Receives a Binary_Int object and calls it's substract_to_binary method. It uses
     * this Binary object as an input for the substract_to_binary method.
     *
     * Ultimately, it calculates the result of this binary object subtracted by the Binary_Int.
     */
    @Override
    public Itypes substract(Itypes number) {
        return number.substract_to_binary(this);
    }
    /**
     * Receives a Scrabble's float as input and returns the floats result
     * of the Scrabble's float multiplied by this Scrabble's binary.
     */
    @Override
    public Itypes multiply_to_Float(floats F) {
        double result_value = F.getFloat_value() * this.transform_to_integers().getInt_value();
        return floatsFactory.createFloats(result_value);
    }
    /**
     * Receives a Scrabble's binary as input and returns the binary result
     * of the Scrabble's binary multiplied by this Scrabble's binary.
     */
    @Override
    public Itypes multiply_to_binary(binary B) {
        int result_value = B.transform_to_integers().getInt_value() * this.transform_to_integers().getInt_value();
        integers result = integersFactory.createIntegers(result_value);
        return result.transform_to_binary();
    }
    /**
     * Receives a Scrabble's integer as input and returns the integers result
     * of the Scrabble's float multiplied by this Scrabble's binary.
     */
    @Override
    public Itypes multiply_to_integer(integers I) {
        int result_value = I.getInt_value() * this.transform_to_integers().getInt_value();
        return integersFactory.createIntegers(result_value);
    }

    /**
     * Receives a Binary_Int object and calls this objects substract_to_binary method. It uses
     * this Binary object as an input for the substract_to_binary method.
     */
    @Override
    public Itypes multiply(Itypes number) {
        return number.multiply_to_binary(this);
    }


    /**
     * Receives a Scrabble's Booleans as input and returns a Scrabble Booleans representing
     * the result of a logical and operation between the Scrabble Booleans input and this Scrabble's Booleans.
     */
    @Override
    public Itypes bool_and(Booleans B) {
        int l = this.getBinary_value().length();
        String str = this.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(B.isBool_value()){
            return binaryFactory.createBinary(str);
        }
        else{
            result.append("0".repeat(l));
            String strResult = result.toString();
            return binaryFactory.createBinary(strResult);
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
    public Itypes binary_and(binary Bin) {
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
        return binaryFactory.createBinary(resultStr);
    }
    /**
     * Receives an SLogical object and calls it's binary_and method. It uses
     * this Binary object as an input for the binary_and method.
     *
     * Ultimately, it calculates the result the logical and operation between this Scrabble binary object and
     * the SLogical input object.
     */

    @Override
    public Itypes and(Itypes L) {
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
    public Itypes bool_or(Booleans B) {
        int l = this.getBinary_value().length();
        String str = this.getBinary_value();
        StringBuilder result = new StringBuilder();
        if(!B.isBool_value()){
            return binaryFactory.createBinary(str);
        }
        else{
            result.append("1".repeat(l));
            String strResult = result.toString();
            return binaryFactory.createBinary(strResult);
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
    public Itypes binary_or(binary Bin) {
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
        return binaryFactory.createBinary(resultStr);
    }
    /**
     * Receives an SLogical object and calls it's binary_or method. It uses
     * this Binary object as an input for the binary_or method.
     *
     * Ultimately, it calculates the result the logical or operation between this Scrabble binary object and
     * the SLogical input object.
     */

    @Override
    public Itypes or(Itypes L) {
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
        return binaryFactory.createBinary(result_value);
    }

    /**
     * Receives an integers i as input. If i's value is greater than this objects value, it returns 1. If it is lesser
     * it returns -1 and if it's equal it returns 0. It uses the java Double.compare method.
     */
    @Override
    public int compareToInt(integers i) {
        return Double.compare(i.getInt_value(), this.transform_to_integers().getInt_value());
    }


    /**
     * Receives a floats f as input. If f's value is greater than this objects value, it returns 1. If it is lesser
     * it returns -1 and if it's equal it returns 0. It uses the java Double.compare method.
     */
    @Override
    public int compareToFloat(floats f) {
        return Double.compare(f.getFloat_value(), this.transform_to_integers().getInt_value());
    }

    /**
     * Receives a binary b as input. If b's value when transformed to an integers is greater than this objects value, it returns 1. If it is lesser
     * it returns -1 and if it's equal it returns 0. It uses the java Double.compare method.
     */
    @Override
    public int compareToBinary(binary b) {
        return Double.compare(b.transform_to_integers().getInt_value(), this.transform_to_integers().getInt_value());
    }

    /**
     * Receives an Itypes object and calls it's compareToInt method. It uses
     * this integers object as an input for compareToInt method.
     *
     * Ultimately, it calculates the result of the comparison of this integers object and the Itypes input.
     */
    @Override
    public int compareTo(@NotNull Itypes o) {
        return o.compareToBinary(this);
    }

}
