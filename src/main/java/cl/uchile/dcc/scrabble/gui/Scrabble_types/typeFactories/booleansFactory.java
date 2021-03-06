package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;



import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a scrabble Booleans Factory.
 */
public class booleansFactory {

    private booleansFactory() {
    }

    /**
     * This Hashmap stores Booleans objects, with their
     * Boolean bool_value attribute as key.
     */
    static Map<Boolean, Booleans> Booleans = new HashMap<>();

    private static final booleansFactory bFactory = new booleansFactory();

    /**
     * This method returns a scrabble Booleans object.
     * It receives a boolean as input, which represents
     * a bool_value for a Booleans object.
     * The method checks if that bool_value key already exists
     * in the hashmap. If it doesnt, it creates a Booleans with
     * bool_value as its attribute. adds it to the hashmap and then returns it.
     *
     * If it already exists in the hashmap, it simply returns that object
     * instead of creating a new one.
     */
    public static Booleans createBooleans(Boolean Booleans_value){

        Booleans result = Booleans.get(Booleans_value);

        if (result == null){
            result = new Booleans(Booleans_value);
            Booleans.put(Booleans_value, result);
        }
        return result;
    }
    /**
     * Returns the hashmap that stores Booleans objects.
     */
    public Map<Boolean, Booleans> get_map(){
        return Booleans;
    }
    /**
     * Always returns bFactory ensuring only one Factory is created.
     */
    public static booleansFactory getbFactory(){
        return bFactory;
    }

}
