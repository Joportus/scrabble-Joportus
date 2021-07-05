package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;

import java.util.HashMap;
import java.util.Map;


/**
 * This class represents a scrabble floats Factory.
 */
public class integersFactory {


    private integersFactory() {
    }
    /**
     * This Hashmap stores integers objects, with their
     * Integer int_value attribute as key.
     */
    static Map<Integer, integers> Integers = new HashMap<>();

    private static final integersFactory iFactory = new integersFactory();


    /**
     * This method returns a scrabble integers object.
     * It receives an int as input, which represents
     * an int_value for an integers object.
     * The method checks if that integers_value key already exists
     * in the hashmap. If it doesnt, it creates an integers with
     * integers_value as its attribute. adds it to the hashmap and then returns it.
     *
     * If it already exists in the hashmap, it simply returns that object
     * instead of creating a new one.
     */
    public static integers createIntegers(Integer integers_value){
        integers result = Integers.get(integers_value);
        if (result == null){
            result = new integers(integers_value);
            Integers.put(integers_value, result);
        }
        return result;
    }

    /**
     * Returns the hashmap that stores integers objects.
     */
    public Map<Integer, integers> get_map(){
        return Integers;
    }
    /**
     * Always returns iFactory ensuring only one Factory is created.
     */
    public static integersFactory getiFactory(){
        return iFactory;
    }


}
