package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.equalsTo;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.lesserThan;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.*;
import cl.uchile.dcc.scrabble.gui.Visitors.Visitor;
import cl.uchile.dcc.scrabble.gui.Visitors.whileVisitor;
import org.junit.jupiter.api.Test;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;
import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.getVariables;
import static org.junit.jupiter.api.Assertions.*;

class IfTest {

    @Test
    void eval() {

        variable x = new variable("x", integersFactory.createIntegers(5));
        x.eval();
        variable y = new variable("y", integersFactory.createIntegers(50));
        y.eval();

        new variable("y", integersFactory.createIntegers(50)).eval();

        assertEquals(gVar("x"), new integers(5));

        If if1 = new If(new lesserThan("x", "y"), new multiplyToVar("x", new integers(10)), new divideVar("x", new integers(10)));



        if1.eval();

        assertEquals(gVar("x"), new integers(50));



        if1.eval();

        assertEquals(gVar("x"), new integers(5));



        If if2 = new If(new equalsTo("x", "y"), new subToVar("x", gVar("y")), new multiplyToVar("x", gVar("y")));

        if2.eval();

        assertEquals(gVar("x"), new integers(250));



        variable a = new variable("a", integersFactory.createIntegers(5));
        a.eval();
        variable b = new variable("b", integersFactory.createIntegers(2));
        b.eval();

        assertEquals(gVar("a"), new integers(5));



        If if3 = new If(new lesserThan("a", "b"), new multiplyToVar("a", new integers(10)), new divideVar("a", new integers(10)));

        if3.eval();


        new variable("b", new integers(0)).eval();

        If if4 = new If(new equalsTo("a", "b"), new addToVar("a", new integers(5)), new addToVar("b", new integers(10)));

        if4.eval();

        Visitor wv = new whileVisitor();

        NullType nullType = nullTypeFactory.createNull();

        assertEquals(nullType, wv.visitIf(if1));

        If if5 = new If(new SAdd(new integers(1), new integers(2)), new addToVar("a", new integers(5)), new addToVar("b", new integers(10)));

        if5.eval();

        assertEquals(nullType, if5.eval());













    }
}