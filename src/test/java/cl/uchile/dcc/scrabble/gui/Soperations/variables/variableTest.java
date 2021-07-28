package cl.uchile.dcc.scrabble.gui.Soperations.variables;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.greaterThan;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import org.junit.jupiter.api.Test;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.*;

class variableTest {

    @Test
    void eval() {
        integers I1 = integersFactory.createIntegers(5);
        integers I2 = integersFactory.createIntegers(30);
        integers count = integersFactory.createIntegers(1);

        var("a", I1);
        var("b", I2);

        System.out.println(var("c", new floats(3)));

        System.out.println(gVar("c"));

        var("c", new integers(5));

        System.out.println(gVar("c"));

        variable a = new variable("a", I1);



        treeNode cond = new greaterThan("a", "b");

        //While w1 = new While(new greaterThan("b", "a"),  new variable("a", new SAdd(gVar("a"), count).eval()));

        While w1 = new While(new greaterThan("b", "a"),  new addToVar("a",count));

        While w2 = new While(new greaterThan("b", "c"), new subToVar("b", new floats(1)));

        w1.eval();

        getVariables().clear();

        var("a", I1);
        var("b", I2);

        System.out.println(var("c", new floats(3)));

        w2.eval();

        System.out.println(getVariables());

        System.out.println(gVar("a"));





        /*
        String v1Name = "a";
        String v2Name = "b";

        intVariables v1 = new intVariables(v1Name, I1);
        intVariables v2 = new intVariables(v2Name, I2);
        v1.eval();
        v2.eval();
        v1.eval();
        While w1 = new While(new Booleans(getIntVariables().get("a").compareTo(getIntVariables().get("b")) < 0), new intVariables("a", (integers) getIntVariables().get("a").sum(count)));


        While w2 = new While(new greaterThan(getIntVariables().get("a"), getIntVariables().get("b")), new integers(1));
        System.out.println(w2.getLeftChild().eval());
        new intVariables("a", (integers) getIntVariables().get("a").sum(count)).eval();
        System.out.println(new Booleans(getIntVariables().get("a").compareTo(getIntVariables().get("b")) < 0));
        System.out.println(w2.getLeftChild().eval());
        */
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