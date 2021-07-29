package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.greaterThan;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.addToVar;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.subToVar;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.variable;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.ifVisitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;
import org.junit.jupiter.api.Test;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;
import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.getVariables;
import static org.junit.jupiter.api.Assertions.*;

class WhileTest {

    @Test
    void eval() {
        integers I1 = integersFactory.createIntegers(5);
        integers I2 = integersFactory.createIntegers(30);
        integers count = integersFactory.createIntegers(1);

        new variable("a", I1).eval();
        new variable("b", I2).eval();

        System.out.println(new variable("c", new floats(3)).eval());

        System.out.println(gVar("c"));

        new variable("c", new integers(5)).eval();

        System.out.println(gVar("c"));

        variable a = new variable("a", I1);



        treeNode cond = new greaterThan("a", "b");

        //While w1 = new While(new greaterThan("b", "a"),  new variable("a", new SAdd(gVar("a"), count).eval()));

        While w1 = new While(new greaterThan("b", "a"),  new addToVar("a",count));

        While w2 = new While(new greaterThan("b", "c"), new subToVar("b", new floats(1)));

        System.out.println(getVariables());

        w1.eval();

        System.out.println(getVariables());

        getVariables().clear();

        new variable("a", I1).eval();
        new variable("b", I2).eval();

        System.out.println(new variable("c", new floats(3)).eval());

        w2.eval();

        System.out.println(getVariables());

        System.out.println(gVar("a"));

        NullType nullType = nullTypeFactory.createNull();

        Visitor iv = new ifVisitor();

        assertEquals(nullType, iv.visitWhile(w1));





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