package org.example.GameObjects.Figures.FuguresUtils;

import java.util.ArrayList;

public class DeleteImpossibleCoordinates {
    public static ArrayList<Coordinate> boundaryOverrunCheck(ArrayList<Coordinate> coordinates){
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
