package cl.uchile.dcc.scrabble.gui;

public interface Int_Float extends Inumber{
    /**
     * Returns the Inumber result of the multiplication between the Inumber input
     * and this Inumber.
     */
    Inumber multiply(Inumber inumber);
    /**
     * Returns the Inumber result of the sum between the Inumber input
     * and this Inumber.
     */
    Inumber sum(Inumber inumber);
    /**
     * Returns the Inumber result of this Inumber minus the Inumber input.
     */
    Inumber substract(Inumber inumber);

    /**
     * Returns the Inumber result of this Inumber divide by the Inumber input.
     */
    Inumber divide(Inumber inumber);
}
