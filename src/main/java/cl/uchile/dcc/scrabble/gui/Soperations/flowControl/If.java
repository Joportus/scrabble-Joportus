package cl.uchile.dcc.scrabble.gui.Soperations.flowControl;

import cl.uchile.dcc.scrabble.gui.Itypes;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.booleansFactory;
import cl.uchile.dcc.scrabble.gui.Scrabble_types.typeFactories.nullTypeFactory;
import cl.uchile.dcc.scrabble.gui.Soperations.ThreeChildNodes;
import cl.uchile.dcc.scrabble.gui.Soperations.treeNode;

public class If extends ThreeChildNodes {

    public If(treeNode leftChild, treeNode middleChild, treeNode rightChild) {
        super(leftChild, middleChild, rightChild);
    }

    @Override
    public Itypes eval() {
        if(this.getLeftChild().eval().equals(booleansFactory.createBooleans(true))){
            return this.getMiddleChild().eval();
        }
        else if(this.getLeftChild().eval().equals(booleansFactory.createBooleans(false))){
            return this.getRightChild().eval();
        }
        else{
            return nullTypeFactory.createNull();
        }
    }
}
