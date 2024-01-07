package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.FuguresUtils.Shift;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class PawnMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = moveBuilder(new ArrayList<>(), figure, board);

        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        Coordinate figureCoordinate = figure.getCoordinate();

        for(Coordinate cord: coordinates){
            if(board.getFigure(cord.getY(), cord.getX()) != null && cord.getX() != figureCoordinate.getX()){
                if(board.getFigure(cord.getY(), cord.getX()).getColor() != figure.getColor()){
                    returnedCoordinates.add(cord);
                }
            } else if(cord.getX() == figureCoordinate.getX() && board.getFigure(cord.getY(), cord.getX()) == null) {
                returnedCoordinates.add(cord);
            }
        }

        return returnedCoordinates;
    }
    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        Coordinate figureCoordinate = figure.getCoordinate();

        if(figure.getColor()) {
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 0));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 1));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -1));
        }
        else{
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 0));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 1));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, -1));
        }

        return coordinates;
    }
    @Override
    public ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        Coordinate figureCoordinate = figure.getCoordinate();

        if(figure.getColor()) {
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 1));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -1));
        }
        else{
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 1));
            coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, -1));
        }

        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        return deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);
    }

}
