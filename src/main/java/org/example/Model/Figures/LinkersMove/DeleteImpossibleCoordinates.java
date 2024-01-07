package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class DeleteImpossibleCoordinates {
    public ArrayList<Coordinate> boundaryOverrunCheck(ArrayList<Coordinate> coordinates) {
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        for (Coordinate cord : coordinates) {
            if (cord.getY() <= 9 && cord.getY() >= 0 &&
                    cord.getX() <= 9 && cord.getX() >= 0) {
                returnedCoordinates.add(cord);
            }
        }

        return returnedCoordinates;
    }

    public ArrayList<Coordinate> checkSquareForFigure(ArrayList<Coordinate> coordinates, Figure figure, Board board){
        coordinates = boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        for(Coordinate cord: coordinates){
            if(board.getFigure(cord.getY(), cord.getX()) != null){
                if(board.getFigure(cord.getY(), cord.getX()).getColor() != figure.getColor()){
                    returnedCoordinates.add(cord);
                }
            } else {
                returnedCoordinates.add(cord);
            }
        }

        return returnedCoordinates;
    }

    public ArrayList<Coordinate> checkFriendlyAttack(ArrayList<Coordinate> coordinates, Figure figure, Board board){
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();
        boolean colorFigure = figure.getColor();

        for(Coordinate cord: coordinates){
            if((board.getFigure(cord.getY(), cord.getX()) != null && board.getFigure(cord.getY(), cord.getX()).getColor() == colorFigure)){
                continue;
            }
            returnedCoordinates.add(cord);
        }

        return returnedCoordinates;
    }
}
