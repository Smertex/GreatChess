package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.KingMove;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class King extends Figure {
    private boolean shah;
    public King(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('♚');
        this.shah = false;
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new KingMove();

        return movePattern.checkingExistenceMoves(this, board);
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        MovePattern movePattern = new KingMove();

        return movePattern.imaginaryMoves(this, board);
    }

    public void setShah(boolean shah) {
        this.shah = shah;
    }
    public boolean getShah() {
        return this.shah;
    }

    //Король
}
