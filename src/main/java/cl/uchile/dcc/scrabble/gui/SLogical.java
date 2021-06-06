package cl.uchile.dcc.scrabble.gui;

public interface SLogical {
    SLogical bool_and(Booleans B);
    SLogical binary_and(binary Bin);
    SLogical and(SLogical L);
    SLogical bool_or(Booleans B);
    SLogical binary_or(binary Bin);
    SLogical or(SLogical L);

}

