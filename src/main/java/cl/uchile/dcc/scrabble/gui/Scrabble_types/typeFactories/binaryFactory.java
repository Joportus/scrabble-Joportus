package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;


import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a scrabble binary Factory.
 */
public class binaryFactory {

    private binaryFactory() {
    }

    /**
     * This Hashmap stores binary objects, with their
     * String binary_value attribute as key.
     */
    static Map<String, binary> Binary = new HashMap<>();


    private static final binaryFactory binFactory = new binaryFactory();


    /**
     * This method returns a scrabble binary object.
     * It receives a String as input, which represents
     * a binary_value for a binary object.
     * The method checks if that binary_value key already exists
     * in the hashmap. If it doesnt, it creates a binary with
     * binary_value as its attribute. adds it to the hashmap and then returns it.
     *
     * If it already exists in the hashmap, it simply returns that object
     * instead of creating a new one.
     */
    public static binary createBinary(String binary_value){

        binary result = Binary.get(binary_value);
        if (result == null){
            result = new binary(binary_value);
            Binary.put(binary_value, result);
        }
        return result;
    }
    /**
     * Returns the hashmap that stores binary objects.
     */
    public Map<String, binary> get_map(){
        return Binary;
    }

    /**
     * Always returns binFactory ensuring only one Factory is created.
     */
    public static binaryFactory getBinFactory() {
        return binFactory;
    }
}
