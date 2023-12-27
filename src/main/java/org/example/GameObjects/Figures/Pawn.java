package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.Figures.LinkersMove.PawnMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Pawn extends Figure {
    public Pawn(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new PawnMove();
        ArrayList<Coordinate> coordinates =  new ArrayList<>(movePattern.checkingMoves(board, this.coordinate, this.color));
        coordinates = checkingEmptinessSquare(coordinates, board);

        return coordinates;
    }

    //Пешка
}
