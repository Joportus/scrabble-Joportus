package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Strings;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import java.util.HashMap;
import java.util.Map;

public class variable implements treeNode{

    private String variableName;
    private Itypes variableValue;


    static Map<String, Itypes> variables = new HashMap<>();

    public variable(String variableName, Itypes variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

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


    @Override
    public Itypes eval() {
        Itypes result = getVariables().get(this.getVariableName());
        Itypes value = getVariableValue().eval();
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

    public String getVariableName() {
        return variableName;
    }


    public Itypes getVariableValue() {
        return variableValue;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public void setVariableValue(Itypes variableValue) {
        this.variableValue = variableValue;
    }
}
