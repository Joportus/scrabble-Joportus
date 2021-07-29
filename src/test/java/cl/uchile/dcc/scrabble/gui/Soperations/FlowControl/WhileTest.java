package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.floats;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.greaterThan;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.notEqual;
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

        variable n1 = new variable("n1", new floats(1));
        variable c = new variable("count", new integers(1));

        n1.eval();
        c.eval();

        new variable("a", I1).eval();

        new variable("b", I2).eval();

        new variable("c", new floats(3)).eval();

        new variable("c", new integers(5)).eval();


        assertEquals(gVar("a"), new integers(5));


        While w1 = new While(new greaterThan("b", "a"),  new addToVar("a", "count"));




        While w2 = new While(new greaterThan("b", "c"), new subToVar("b", "n1"));



        w1.eval();



        assertEquals(gVar("a"), new integers(30));


        getVariables().clear();

        new variable("a", I1).eval();

        new variable("b", I2).eval();

        new variable("c", new floats(3)).eval();

        assertEquals(gVar("b"), new integers(30));

        n1.eval();

        w2.eval();



        assertEquals(gVar("b"), new floats(3));

        NullType nullType = nullTypeFactory.createNull();

        Visitor iv = new ifVisitor();

        assertEquals(nullType, iv.visitWhile(w1));

        getVariables().clear();


        variable a = new variable("a", new integers(270));
        variable b = new variable("b", new integers(192));

        variable zero = new variable("z", new integers(0));
        zero.eval();


        a.eval();
        b.eval();

        //GCD algorithm
        While euclid = new While(new notEqual("b", "z"),
                         new If(new greaterThan("a", "b"),
                            new subToVar("a", "b"),
                            new subToVar("b", "a")));


        euclid.eval();

        Itypes MCD = gVar("a");

        new variable("a", new integers(24)).eval();

        new variable("b", new integers(18)).eval();

        System.out.println(getVariables());

        euclid.eval();

        MCD = gVar("a");

        assertEquals(MCD, new integers(6));


        new variable("a", new integers(4)).eval();

        new variable("b", new integers(4)).eval();

        euclid.eval();

        MCD = gVar("a");



        assertEquals(MCD, new integers(4));

        new variable("a", new integers(12356)).eval();

        new variable("b", new integers(7864)).eval();

        euclid.eval();

        MCD = gVar("a");


        assertEquals(MCD, new integers(4));


        new variable("a", new integers(678)).eval();

        new variable("b", new integers(260352)).eval();

        euclid.eval();

        MCD = gVar("a");


        assertEquals(MCD, new integers(678));






    }
}