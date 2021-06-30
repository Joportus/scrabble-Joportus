package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;


import java.util.HashMap;
import java.util.Map;

public class binaryFactory {
    static Map<binary, binary> Binary = new HashMap<>();


    public static binary createBinary(String binary_value){
        binary binary_key = new binary(binary_value);
        binary result = Binary.get(binary_key);
        if (result == null){
            result = new binary(binary_value);
            Binary.put(binary_key, result);
        }
        return result;
    }

    public Map<binary, binary> get_map(){
        return Binary;
    }
}
