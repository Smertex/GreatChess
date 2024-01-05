package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;
import org.example.GameObjects.OtherObjects.Board;

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
        return deleteImpossibleCoordinates.checkSquareForFigure(coordinates, figure, board);
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board) {
        return checkingExistenceMoves(figure, board);
    }
}
