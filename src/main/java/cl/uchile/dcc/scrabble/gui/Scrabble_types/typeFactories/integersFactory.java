package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;

import java.util.HashMap;
import java.util.Map;

public class integersFactory {

    static Map<Integer, integers> Integers = new HashMap<>();

    public static integers createIntegers(int integers_value){
        Integer integer_key = integers_value;
        integers result = Integers.get(integer_key);
        if (result == null){
            result = new integers(integers_value);
            Integers.put(integer_key, result);
        }
        return result;
    }

    public Map<Integer, integers> get_map(){
        return Integers;
    }
}
