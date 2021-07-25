package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import java.util.HashMap;
import java.util.Map;

public class variable implements treeNode {
    private final String variableName;
    private treeNode variableValue;

    public variable(String variableName, Itypes variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }
    static Map<String, Itypes> variables = new HashMap<>();

    public static Map<String, Itypes> getVariables() {
        return variables;
    }

    @Override
    public Itypes eval() {
        Itypes result = getVariables().get(this.getVariableName());
        Itypes value = this.getVariableValue().eval();
        if(result == null){
            getVariables().put(this.getVariableName(), value);
        }
        else if(result.equals(value)){
            return value;
        }
        else{
            getVariables().replace(this.getVariableName(), value);
        }
        return value;

    }


    public String getVariableName() {
        return variableName;
    }

    public treeNode getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(treeNode variableValue) {
        this.variableValue = variableValue;
    }
}
