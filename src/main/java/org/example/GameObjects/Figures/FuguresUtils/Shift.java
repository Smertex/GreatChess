package org.example.GameObjects.Figures.FuguresUtils;

import org.example.GameObjects.Figures.Coordinate;

public class Shift {
    public static Coordinate shiftCoordinate(Coordinate coordinate, int y, int x){
        return new Coordinate(coordinate.getY() + y, coordinate.getX() + x);
    }
}
