package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public interface MovePattern {
    ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board);
    ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board);
    default ArrayList<Coordinate> boundaryOverrunCheck(ArrayList<Coordinate> coordinates){
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        for(Coordinate cord: coordinates) {
            if(cord.getY() <= 9 && cord.getY() >= 0 &&
                    cord.getX() <= 9 && cord.getX() >= 0){
                returnedCoordinates.add(cord);
            }
        }

        return returnedCoordinates;
    }
}
