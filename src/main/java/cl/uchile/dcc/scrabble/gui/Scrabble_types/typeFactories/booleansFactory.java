package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;



import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class booleansFactory {

    static Map<Boolean, Booleans> Booleans = new HashMap<>();

    public static Booleans createBooleans(boolean Booleans_value){
        Boolean Booleans_key = Booleans_value;
        Booleans result = Booleans.get(Booleans_key);
        if (result == null){
            result = new Booleans(Booleans_value);
            Booleans.put(Booleans_key, result);
        }
        return result;
    }

    public Map<Boolean, Booleans> get_map(){
        return Booleans;
    }
}
