package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.FuguresUtils.Shift;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class LengthMove {
    public ArrayList<Coordinate> moveInTarget(Coordinate basicCoordinate, Coordinate stepCoordinates, Board board){
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        int stepY = stepCoordinates.getY();
        int stepX = stepCoordinates.getX();
        Coordinate shift = Shift.shiftCoordinate(basicCoordinate, stepY, stepX);

        while(shift.getY() <= 9 && shift.getY() >= 0 &&
                shift.getX() <= 9 && shift.getX() >= 0){

            if(board.getFigure(shift.getY(), shift.getX()) != null){
                coordinates.add(shift);
                break;
            }

            coordinates.add(Shift.shiftCoordinate(basicCoordinate, stepY, stepX));

            stepY += stepCoordinates.getY();
            stepX += stepCoordinates.getX();
            shift = Shift.shiftCoordinate(basicCoordinate, stepY, stepX);
        }
        return coordinates;
    }

}
