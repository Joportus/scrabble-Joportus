package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;



import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;

import java.util.HashMap;
import java.util.Map;

public class stringsFactory {
    static Map<String, Strings> Strings = new HashMap<>();


    public static Strings createStrings(String Strings_value){

        Strings result = Strings.get(Strings_value);
        if (result == null){
            result = new Strings(Strings_value);
            Strings.put(Strings_value, result);
        }
        return result;
    }

    public Map<String, Strings> get_map(){
        return Strings;
    }
}
