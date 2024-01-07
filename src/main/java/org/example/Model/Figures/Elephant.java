package org.example.Model.Figures;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.LinkersMove.ElephantMove;
import org.example.Model.Figures.LinkersMove.MovePattern;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class Elephant extends Figure {
    public Elephant(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('♝');
    }
    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new ElephantMove();

        return movePattern.checkingExistenceMoves(this, board);
    }
    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        MovePattern movePattern = new ElephantMove();

        return movePattern.imaginaryMoves(this, board);
    }
    //Слон
}
