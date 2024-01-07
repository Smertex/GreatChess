package org.example.Model.Figures;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.LinkersMove.MovePattern;
import org.example.Model.Figures.LinkersMove.PawnMove;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class Pawn extends Figure {
    public Pawn(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('♟');
    }
    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new PawnMove();

        return new ArrayList<>(movePattern.checkingExistenceMoves(this, board));
    }
    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        MovePattern movePattern = new PawnMove();

        return movePattern.imaginaryMoves(this, board);
    }

    //Пешка
}
