package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import java.util.HashMap;
import java.util.Map;

public class variable {

    static Map<String, Itypes> variables = new HashMap<>();

    public static Map<String, Itypes> getVariables() {
        return variables;
    }

    public static Itypes var(String variableName, Itypes variableValue){
        Itypes result = getVariables().get(variableName);
        Itypes value = variableValue.eval();
        if(result == null){
            getVariables().put(variableName, value);
        }
        else if(result.equals(value)){
            return value;
        }
        else{
            getVariables().replace(variableName, value);
        }
        return value;

    }

    public static Itypes gVar(String variableName){
        return getVariables().get(variableName);
    }


}
