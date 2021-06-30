package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;


import java.util.HashMap;
import java.util.Map;

public class floatsFactory {
    
    static Map<floats, floats> Floats = new HashMap<>();

    public static floats createFloats(double floats_value){
        floats floats_key = new floats(floats_value);
        floats result = Floats.get(floats_key);
        if (result == null){
            result = new floats(floats_value);
            Floats.put(floats_key, result);
        }
        return result;
    }

    public Map<floats, floats> get_map(){
        return Floats;
    }
}