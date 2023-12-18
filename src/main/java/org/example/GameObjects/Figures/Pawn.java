package org.example.GameObjects.Figures;

public class Pawn extends Figure{
    private boolean firstMove;
    public Pawn(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
        this.firstMove = false;
    }
    @Override
    void movePattern() {

    }
    //Пешка
}
