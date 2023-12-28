package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;

import java.util.ArrayList;

public class RookMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingMoves(Coordinate coordinate) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            coordinates.add(Shift.shiftCoordinate(coordinate, i, 0));
            coordinates.add(Shift.shiftCoordinate(coordinate, -i, 0));
            coordinates.add(Shift.shiftCoordinate(coordinate, 0, i));
            coordinates.add(Shift.shiftCoordinate(coordinate, 0, -i));
        }

        return coordinates;
    }
}
