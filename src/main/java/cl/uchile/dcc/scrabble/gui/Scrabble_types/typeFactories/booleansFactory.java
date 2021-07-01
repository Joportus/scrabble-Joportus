package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;



import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class booleansFactory {
    static Booleans[] Booleans_array = new Booleans[]{new Booleans(true), new Booleans(false)};

    public static Booleans createBooleans(boolean Booleans_value){

        if (!Booleans_value){
            return Booleans_array[1];
        }
        else {
            return Booleans_array[0];
        }
    }
    
}
