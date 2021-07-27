package cl.uchile.dcc.scrabble.gui.Visitors;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.Booleans;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.integers;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.Comparisons;
import cl.uchile.dcc.scrabble.gui.Soperations.Comparisons.greaterThan;
import cl.uchile.dcc.scrabble.gui.Soperations.FlowControl.While;
import cl.uchile.dcc.scrabble.gui.Soperations.math.SAdd;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.varModifier;
import cl.uchile.dcc.scrabble.gui.Soperations.variables.variable;

import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.gVar;
import static cl.uchile.dcc.scrabble.gui.Soperations.variables.variable.getVariables;

public class whileVisitor implements Visitor{
/*
    @Override
    public Itypes visitWhile(While w) {
        Comparisons cond = w.getLeftChild();
        variable task = w.getRightChild();

        String taskName = task.getVariableName();
        Itypes taskValue = task.getVariableValue();

        String var1Name = cond.getVar1();
        String var2Name = cond.getVar2();


        for(int i = 0; i < 10; i++){
            if(cond.eval().equals(new Booleans(true))){
                System.out.println(getVariables());
                w.getRightChild().eval();

                w.getLeftChild().setVar1(var1Name);

                w.getLeftChild().setVar2(var2Name);

                w.setLeftChild(cond);

                w.getRightChild().setVariableName(taskName);


                w.setRightChild(new variable("a", gVar("a").sum(new integers(1))));

            }

        }
        return null;
    }
*/



    @Override
    public Itypes visitWhile(While w) {
        Itypes STrue = new Booleans(true);

        while(w.getLeftChild().eval().equals(STrue)){
            System.out.println(getVariables());

            w.getRightChild().calculate().eval();

        }
        return null;
    }
    /*
    @Override
    public Itypes visitWhile(While w) {
        Comparisons cond = w.getLeftChild();
        String task = w.getRightChild().getVariable();

        //String taskName = task.getVariableName();
        // Itypes taskValue = task.getVariableValue();

        String var1Name = cond.getVar1();
        String var2Name = cond.getVar2();

        integers n = w.getRightChild().getNumber();

        for(int i = 0; i < 10; i++){
            System.out.println(getVariables());

            w.getRightChild().calculate().eval();



            w.getLeftChild().setVar1(var1Name);

            w.getLeftChild().setVar2(var2Name);

            w.setLeftChild(cond);

            w.setRightChild(new varModifier(task, n));

            //w.getRightChild().setVariableName(taskName);


            //w.setRightChild(new variable(taskName, gVar(taskName).sum(gVar(taskName))));


        }
        return null;
    }
    */

}



