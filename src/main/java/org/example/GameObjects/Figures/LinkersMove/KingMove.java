package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class KingMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 0));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 0));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 0, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 0, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, -1));

        coordinates = existenceMove(coordinates, figure, board);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> existenceMove(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        coordinates = boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = coordinates;

        return returnedCoordinates;
    }
}
