package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import java.util.HashMap;
import java.util.Map;

public class intVariables implements treeNode{
    private final String variableName;
    private integers variableValue;

    public intVariables(String variableName, integers variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }
    static Map<String, integers> intVariables = new HashMap<>();

    public static Map<String, integers> getIntVariables() {
        return intVariables;
    }

    @Override
    public Itypes eval() {
        integers result = getIntVariables().get(this.getVariableName());
        integers value = this.getVariableValue();
        if(result == null){
            getIntVariables().put(this.getVariableName(), value);
        }
        else if(result.equals(value)){
            return value;
        }
        else{
            getIntVariables().replace(this.getVariableName(), value);
        }
        return value;

    }


    public String getVariableName() {
        return variableName;
    }

    public integers getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(integers variableValue) {
        this.variableValue = variableValue;
    }
}
