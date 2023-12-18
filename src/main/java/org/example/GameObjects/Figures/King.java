package org.example.GameObjects.Figures;

public class King extends Figure{
    private boolean firstMove;
    public King(Boolean color, Boolean condition) {
        super(color, condition);
        this.firstMove = false;
    }
    @Override
    void movePattern() {

    }
    //Король
}
