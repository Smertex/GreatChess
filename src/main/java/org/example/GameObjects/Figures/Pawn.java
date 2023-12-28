package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.Figures.LinkersMove.PawnMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Pawn extends Figure {
    public Pawn(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new PawnMove();
        ArrayList<Coordinate> coordinates =  new ArrayList<>(movePattern.checkingMoves(this.coordinate));
        coordinates = checkingEmptinessSquare(coordinates, board);

        return coordinates;
    }

    //Пешка
}
