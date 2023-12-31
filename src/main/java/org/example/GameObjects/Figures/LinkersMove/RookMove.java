package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class RookMove implements MovePattern {

    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        Coordinate figureCoordinate = figure.getCoordinate();

        for(int i = 1; i <= 9; i++){
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, i, 0));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, -i, 0));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 0, i));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 0, -i));
        }

        coordinates = moveBuilder(coordinates, figure, board);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        coordinates = boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();



        return returnedCoordinates;
    }
}
