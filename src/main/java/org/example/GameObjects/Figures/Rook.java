package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.Figures.LinkersMove.RookMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Rook extends Figure {
    public Rook(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
    }
    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new RookMove();

        return movePattern.checkingMoves(this, board);
    }
    //Ладья
}
