package org.example.GameObjects.Figures;

public class Rook extends Figure{
    private boolean firstMove;
    public Rook(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
        this.firstMove = false;
    }
    @Override
    void movePattern() {

    }
    //Ладья
}
