package cl.uchile.dcc.scrabble.gui.Controller;

import cl.uchile.dcc.scrabble.gui.Controller.logic.LAnd;
import cl.uchile.dcc.scrabble.gui.Controller.logic.LNegate;
import cl.uchile.dcc.scrabble.gui.Controller.logic.LOr;
import cl.uchile.dcc.scrabble.gui.Controller.math.Divide;
import cl.uchile.dcc.scrabble.gui.Controller.math.Minus;
import cl.uchile.dcc.scrabble.gui.Controller.math.Multiply;
import cl.uchile.dcc.scrabble.gui.Controller.math.SAdd;
import cl.uchile.dcc.scrabble.gui.Controller.transformations.toBooleans;
import cl.uchile.dcc.scrabble.gui.Controller.transformations.toFloats;
import cl.uchile.dcc.scrabble.gui.Controller.transformations.toIntegers;
import cl.uchile.dcc.scrabble.gui.Controller.transformations.toStrings;

public class controller {
    public treeNode createAdd(treeNode node1, treeNode node2){
        return new SAdd(node1, node2);
    }
    public treeNode createMinus(treeNode node1, treeNode node2){
        return new Minus(node1, node2);
    }
    public treeNode createMultiply(treeNode node1, treeNode node2){
        return new Multiply(node1, node2);
    }
    public treeNode createDivide(treeNode node1, treeNode node2){
        return new Divide(node1, node2);
    }
    public treeNode createLAnd(treeNode node1, treeNode node2){
        return new LAnd(node1, node2);
    }
    public treeNode createLOr(treeNode node1, treeNode node2){
        return new LOr(node1, node2);
    }
    public treeNode createLNegate(treeNode node){
        return new LNegate(node);
    }
    public treeNode createToBinary(treeNode node){
        return new LNegate(node);
    }
    public treeNode createToFloat(treeNode node){
        return new toFloats(node);
    }
    public treeNode createToIntegers(treeNode node){
        return new toIntegers(node);
    }
    public treeNode createToStrings(treeNode node){
        return new toStrings(node);
    }
    public treeNode createToBooleans(treeNode node){
        return new toBooleans(node);
    }

}
