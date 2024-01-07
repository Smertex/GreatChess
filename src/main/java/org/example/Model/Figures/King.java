package org.example.Model.Figures;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.LinkersMove.KingMove;
import org.example.Model.Figures.LinkersMove.MovePattern;
import org.example.Model.OtherObjects.Board;

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

    public boolean checkShah(Board board){
        this.shah = board.isSquareAttacked(this.coordinate, this.color);
        return this.shah;
    }
    //Король
}
