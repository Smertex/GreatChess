package org.example.GameObjects.Figures;

public class King extends Figure{
    private boolean firstMove;
    public King(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
        this.firstMove = false;
    }
    @Override
    void movePattern() {

    }
    //Король
}
