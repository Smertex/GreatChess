package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.Figures.LinkersMove.PawnMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Pawn extends Figure {
    public Pawn(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new PawnMove();

        return new ArrayList<>(movePattern.checkingMoves(board, this.coordinate, this.color));
    }

    //Пешка
}
