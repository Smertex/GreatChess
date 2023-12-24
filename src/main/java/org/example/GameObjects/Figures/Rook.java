package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.Figures.LinkersMove.RookMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Rook extends Figure {
    public Rook(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
    }
    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new RookMove();

        return new ArrayList<>(movePattern.checkingMoves(board, this.coordinate, this.color));
    }


    //Ладья
}
