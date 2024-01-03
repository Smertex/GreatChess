package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.ElephantMove;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

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
        return null;
    }
    //Слон
}
