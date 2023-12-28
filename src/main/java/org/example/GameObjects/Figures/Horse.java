package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.HorseMove;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Horse extends Figure {
    public Horse(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new HorseMove();
        ArrayList<Coordinate> coordinates = movePattern.checkingMoves(this.coordinate);
        coordinates = checkingEmptinessSquare(coordinates, board);

        return coordinates;
    }


    //Лошадь
}
