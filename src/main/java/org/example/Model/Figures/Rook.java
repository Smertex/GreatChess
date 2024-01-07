package org.example.Model.Figures;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.LinkersMove.MovePattern;
import org.example.Model.Figures.LinkersMove.RookMove;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class Rook extends Figure {
    public Rook(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('♜');
    }
    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new RookMove();

        return movePattern.checkingExistenceMoves(this, board);
    }
    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        MovePattern movePattern = new RookMove();

        return movePattern.imaginaryMoves(this, board);
    }
    //Ладья
}
