package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class PawnMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 0));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -1));

        coordinates = existenceMove(coordinates, figure, board);

        return coordinates;
    }
    @Override
    public ArrayList<Coordinate> existenceMove(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        coordinates = boundaryOverrunCheck(coordinates);
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

}
