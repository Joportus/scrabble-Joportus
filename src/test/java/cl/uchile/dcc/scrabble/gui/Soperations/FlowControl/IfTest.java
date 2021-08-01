package cl.uchile.dcc.scrabble.gui.Soperations.FlowControl;

import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.NullType;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.integersFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.equalsTo;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.lesserThan;
import cl.uchile.dcc.scrabble.gui.Soperations.logic.LAnd;
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

        variable n5 = new variable("n5", new integers(5));

        variable n10 = new variable("n10", new integers(10));

        n5.eval();

        n10.eval();




        variable x = new variable("x", integersFactory.createIntegers(5));
        x.eval();
        variable y = new variable("y", integersFactory.createIntegers(50));
        y.eval();

        new variable("y", integersFactory.createIntegers(50)).eval();

        assertEquals(gVar("x"), new integers(5));


        If if1 = new If(new lesserThan("x", "y"), new multiplyToVar("x", "n10"), new divideVar("x", "n10"));



        if1.eval();



        assertEquals(gVar("x"), new integers(50));



        if1.eval();

        assertEquals(gVar("x"), new integers(5));



        If if2 = new If(new equalsTo("x", "y"), new subToVar("x", "y"), new multiplyToVar("x","y"));

        if2.eval();

        assertEquals(gVar("x"), new integers(250));



        variable a = new variable("a", integersFactory.createIntegers(5));
        a.eval();
        variable b = new variable("b", integersFactory.createIntegers(2));
        b.eval();

        assertEquals(gVar("a"), new integers(5));



        If if3 = new If(new lesserThan("a", "b"), new multiplyToVar("a", "n10"), new divideVar("a", "n10"));

        if3.eval();


        new variable("b", new integers(0)).eval();

        If if4 = new If(new equalsTo("a", "b"), new addToVar("a", "n5"), new addToVar("b", "n10"));

        if4.eval();

        Visitor wv = new whileVisitor();

        NullType nullType = nullTypeFactory.createNull();

        assertEquals(nullType, wv.visitIf(if1));

        If if5 = new If(new SAdd(new integers(1), new integers(2)), new addToVar("a", "n5"), new addToVar("b", "n10"));

        If if6 = new If(new Booleans(true), new SAdd(new integers(1), new integers(2)), new LAnd(new Booleans(true), new Booleans(false)));

        assertEquals(new integers(3), if6.eval());

        if5.eval();

        assertEquals(nullType, if5.eval());












    }
}