package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;

import java.util.ArrayList;

public class PawnMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingMoves(Coordinate coordinate) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        coordinates.add(Shift.shiftCoordinate(coordinate, 1, 0));
        coordinates.add(Shift.shiftCoordinate(coordinate, 1, 1));
        coordinates.add(Shift.shiftCoordinate(coordinate, 1, -1));

        return coordinates;
    }

}
