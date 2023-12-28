package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;

import java.util.ArrayList;

public class ElephantMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingMoves(Coordinate coordinate) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            coordinates.add(Shift.shiftCoordinate(coordinate, i, i));
            coordinates.add(Shift.shiftCoordinate(coordinate, i, -i));
            coordinates.add(Shift.shiftCoordinate(coordinate, -i, i));
            coordinates.add(Shift.shiftCoordinate(coordinate, -i, -i));
        }

        return coordinates;
    }
}
