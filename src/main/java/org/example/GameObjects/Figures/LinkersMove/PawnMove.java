package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class PawnMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingMoves(Board board, Coordinate coordinate, Boolean color) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        coordinates.add(Shift.shiftCoordinate(coordinate, 1, 0));
        coordinates.add(Shift.shiftCoordinate(coordinate, 1, 1));
        coordinates.add(Shift.shiftCoordinate(coordinate, 1, -1));

        return coordinates;
    }

}
