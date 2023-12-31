package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.FuguresUtils.Shift;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class HorseMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 2, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 2, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -2, 1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -2, -1));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, 2));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, 2));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, 1, -2));
        coordinates.add(Shift.shiftCoordinate(figureCoordinate, -1, -2));

        coordinates = moveBuilder(coordinates, figure, board);

        return coordinates;
    }
    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        coordinates = boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        for(Coordinate cord: coordinates){
            if (board.getFigure(cord.getY(), cord.getX()) != null) {
                if(board.getFigure(cord.getY(), cord.getX()).getColor() != figure.getColor()){
                    returnedCoordinates.add(cord);
                }
            } else {
                returnedCoordinates.add(cord);
            }

        }
        return  returnedCoordinates;
    }
}
