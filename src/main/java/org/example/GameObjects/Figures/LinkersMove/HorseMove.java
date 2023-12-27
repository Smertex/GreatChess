package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;

import java.util.ArrayList;

public class HorseMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingMoves(Coordinate coordinate) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        coordinates.add(Shift.shiftCoordinate(coordinate, 2, 1));
        coordinates.add(Shift.shiftCoordinate(coordinate, 2, -1));
        coordinates.add(Shift.shiftCoordinate(coordinate, -2, 1));
        coordinates.add(Shift.shiftCoordinate(coordinate, -2, -1));
        coordinates.add(Shift.shiftCoordinate(coordinate, 1, 2));
        coordinates.add(Shift.shiftCoordinate(coordinate, -1, 2));
        coordinates.add(Shift.shiftCoordinate(coordinate, 1, -2));
        coordinates.add(Shift.shiftCoordinate(coordinate, -1, -2));

        return coordinates;
    }
}
