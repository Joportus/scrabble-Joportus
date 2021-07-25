package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import org.junit.jupiter.api.Test;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.intVariables.getIntVariables;
import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.getVariables;
import static org.junit.jupiter.api.Assertions.*;

class variableTest {

    @Test
    void eval() {
        integers I1 = integersFactory.createIntegers(5);
        integers I2 = integersFactory.createIntegers(10);
        integers count = integersFactory.createIntegers(100);
        String v1Name = "a";
        String v2Name = "b";
        intVariables v1 = new intVariables(v1Name, I1);
        intVariables v2 = new intVariables(v2Name, I2);
        v1.eval();
        v2.eval();
        v1.eval();
        While w1 = new While(new Booleans(getIntVariables().get("a").compareTo(getIntVariables().get("b")) < 0), new intVariables("a", (integers) getIntVariables().get("a").sum(count)));


        While w2 = new While(new Booleans(getIntVariables().get("a").compareTo(getIntVariables().get("b")) < 0), new integers(1));
        System.out.println(w2.getLeftChild());
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        System.out.println(new Booleans(getIntVariables().get("a").compareTo(getIntVariables().get("b")) < 0));
        System.out.println(w2.getLeftChild());

        /*
        System.out.println(getIntVariables());
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        System.out.println(getIntVariables());
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        System.out.println(getIntVariables());
        System.out.println(getIntVariables().get("a").compareTo(getIntVariables().get("b")));
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        System.out.println(getIntVariables().get("a").compareTo(getIntVariables().get("b")));
*/

    }
}