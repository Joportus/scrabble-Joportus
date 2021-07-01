package cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.binary;


import java.util.HashMap;
import java.util.Map;

public class binaryFactory {
    static Map<String, binary> Binary = new HashMap<>();


    public static binary createBinary(String binary_value){

        binary result = Binary.get(binary_value);
        if (result == null){
            result = new binary(binary_value);
            Binary.put(binary_value, result);
        }
        return result;
    }

    public Map<String, binary> get_map(){
        return Binary;
    }
}
