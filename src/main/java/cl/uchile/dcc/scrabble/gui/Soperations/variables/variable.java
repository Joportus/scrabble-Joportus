package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a scrabble variable.
 * It stores scrabble types with a String name associated in a hashmap.
 * The variable class is also a unary operation that is part of our AST.
 */
public class variable implements treeNode{

    private final String variableName;
    private final Itypes variableValue;

    /**
     * This hashmap stores variables where keys are a variable String name and they correspond
     * to an Itypes value.
     */
    static Map<String, Itypes> variables = new HashMap<>();

    /**
     * Creates varModifier object.
     *
     * @param variableName a String that refers to a variable object's name.
     *
     * @param variableValue an Itypes value.
     *
     */
    public variable(String variableName, Itypes variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    /**
     * Returns the variables hashmap containing all variables created.
     */
    public static Map<String, Itypes> getVariables() {
        return variables;
    }

    /**
     * Receives a String and returns the value in the hashmap where the key is
     * the String received.
     */
    public static Itypes gVar(String variableName){
        return getVariables().get(variableName);
    }

    /**
     * Adds this variable object to the variables hashmap. it uses the variableName as key
     * corresponding to variableValue. if that key already exists, it replaces the corresponding value.
     * It then returns the Itypes value.
     */
    @Override
    public Itypes eval() {
        Itypes result = getVariables().get(this.getVariableName());
        Itypes value = this.getVariableValue().eval();
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

    /**
     * Returns this object's variable name.
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Returns this object's variable value.
     */
    public Itypes getVariableValue() {
        return variableValue;
    }

}
