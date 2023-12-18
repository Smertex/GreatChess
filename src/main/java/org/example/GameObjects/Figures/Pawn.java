package org.example.GameObjects.Figures;

public class Pawn extends Figure{
    private boolean firstMove;
    public Pawn(Boolean color, Boolean condition) {
        super(color, condition);
        this.firstMove = false;
    }
    @Override
    void movePattern() {

    }
    //Пешка
}
