package cl.uchile.dcc.scrabble.gui.operations;

public class Add implements Operations {
    private final Operations a1;
    private final Operations a2;

    public Add(Operations a1, Operations a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public Constant eval() {
        return null;
    }

    @Override
    public Constant sum(Constant c) {
        return null;
    }
/**
    @Override
    public Constant eval() {
        return a1.eval().sum(a2.eval());
    }

    @Override
    public Constant sum(Constant c) {
        return null;
    }

    @Override
    public Inumber substract_to_Float(floats F) {
        return null;
    }

    @Override
    public Inumber substract_to_integer(integers I) {
        return null;
    }

    @Override
    public Inumber multiply_to_Float(floats F) {
        return null;
    }

    @Override
    public Inumber multiply_to_integer(integers I) {
        return null;
    }

    @Override
    public Inumber divide_a_Float(floats F) {
        return null;
    }

    @Override
    public Inumber divide_a_integer(integers I) {
        return null;
    }

    @Override
    public Inumber sum_to_int(integers I) {
        return null;
    }

    @Override
    public Inumber sum_to_float(floats F) {
        return null;
    }

    @Override
    public floats transform_to_float() {
        return null;
    }
    **/
}
