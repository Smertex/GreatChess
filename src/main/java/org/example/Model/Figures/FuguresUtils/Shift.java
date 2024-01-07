package org.example.Model.Figures.FuguresUtils;

public class Shift {
    public static Coordinate shiftCoordinate(Coordinate coordinate, int y, int x){
        return new Coordinate(coordinate.getY() + y, coordinate.getX() + x);
    }
}
