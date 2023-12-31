package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.FuguresUtils.Shift;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class KingMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = moveBuilder(new ArrayList<>(), figure, board);

        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.checkSquareForFigure(coordinates, figure, board);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();
        boolean color = figure.getColor();

        for(Coordinate cord: coordinates){
            if(!board.isSquareAttacked(cord, color)){
                returnedCoordinates.add(cord);
            }
        }

        return returnedCoordinates;
    }
    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 0));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 0));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 0, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 0, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, -1));

        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board) {
        return moveBuilder(new ArrayList<>(), figure, board);
    }
}
