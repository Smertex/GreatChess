package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.FuguresUtils.Shift;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class HorseMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = moveBuilder(new ArrayList<>(), figure, board);

        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        return deleteImpossibleCoordinates.checkSquareForFigure(coordinates, figure, board);
    }
    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 2, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 2, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -2, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -2, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 2));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 2));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -2));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, -2));

        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        return deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board) {
        return moveBuilder(new ArrayList<>(), figure, board);
    }
}
