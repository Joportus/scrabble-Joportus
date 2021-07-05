package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a scrabble floats Factory.
 */
public class floatsFactory {

    private floatsFactory() {
    }

    /**
     * This Hashmap stores floats objects, with their
     * Double float_value attribute as key.
     */
    static Map<Double, floats> Floats = new HashMap<>();

    private static final floatsFactory fFactory = new floatsFactory();


    /**
     * This method returns a scrabble floats object.
     * It receives a double as input, which represents
     * a float_value for a floats object.
     * The method checks if that float_value key already exists
     * in the hashmap. If it doesnt, it creates a floats with
     * float_value as its attribute. adds it to the hashmap and then returns it.
     *
     * If it already exists in the hashmap, it simply returns that object
     * instead of creating a new one.
     */
    public static floats createFloats(Double floats_value){
        floats result = Floats.get(floats_value);
        if (result == null){
            result = new floats(floats_value);
            Floats.put(floats_value, result);
        }
        return result;
    }

    /**
     * Returns the hashmap that stores floats objects.
     */
    public Map<Double, floats> get_map(){
        return Floats;
    }

    /**
     * Always returns fFactory ensuring only one Factory is created.
     */
    public static floatsFactory getfFactory(){
        return fFactory;
    }
}
