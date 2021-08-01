package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;



import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a scrabble Strings Factory.
 */
public class stringsFactory {

    private stringsFactory() {
    }
    /**
     * This Hashmap stores Strings objects, with their
     * String Strings_value attribute as key.
     */
    static Map<String, Strings> Strings = new HashMap<>();


    private static final stringsFactory sFactory = new stringsFactory();


    /**
     * This method returns a scrabble Strings object.
     * It receives a String as input, which represents
     * a binary_value for a binary object.
     * The method checks if that binary_value key already exists
     * in the hashmap. If it doesnt, it creates a binary with
     * binary_value as its attribute. adds it to the hashmap and then returns it.
     *
     * If it already exists in the hashmap, it simply returns that object
     * instead of creating a new one.
     */
    public static Strings createStrings(String Strings_value){

        Strings result = Strings.get(Strings_value);
        if (result == null){
            result = new Strings(Strings_value);
            Strings.put(Strings_value, result);
        }
        return result;
    }


    /**
     * Returns the Strings factory hashmap
     */
    public Map<String, Strings> get_map(){
        return Strings;
    }

    /**
     * Always returns sFactory ensuring only one Factory is created.
     */
    public static stringsFactory getsFactory() {
        return sFactory;
    }

}
