package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;

import java.util.HashMap;
import java.util.Map;

public class integersFactory {
    static Map<integers, integers> Integers = new HashMap<>();

    public static integers createIntegers(int integers_value){
        integers integers_key = new integers(integers_value);
        integers result = Integers.get(integers_key);
        if (result == null){
            result = new integers(integers_value);
            Integers.put(integers_key, result);
        }
        return result;
    }

    public Map<integers, integers> get_map(){
        return Integers;
    }
}
