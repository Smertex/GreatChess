package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public abstract class Figure {
    //true - white figure, false - black figure
    protected final Boolean color;
    protected Coordinate coordinate;
    public Figure(Boolean color, Coordinate coordinate){
        this.color = color;
        this.coordinate = coordinate;
    }
    public void displacement(Coordinate coordinate){
        this.coordinate = coordinate;
    }
    public abstract ArrayList<Coordinate> existenceMove(Board board);
    protected ArrayList<Coordinate> checkingEmptinessSquare(ArrayList<Coordinate> coordinates, Board board){
        coordinates = boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();


        for(Coordinate cord: coordinates){
            if (board.getFigure(cord.getY(), cord.getX()) != null) {
                if(board.getFigure(cord.getY(), cord.getX()).getColor() != color){
                    returnedCoordinates.add(cord);
                }
            } else {
                returnedCoordinates.add(cord);
            }

        }
        return  returnedCoordinates;
    }
    protected ArrayList<Coordinate> boundaryOverrunCheck(ArrayList<Coordinate> coordinates){
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        for(Coordinate cord: coordinates) {
            if(cord.getY() <= 9 || cord.getY() >= 0 ||
                    cord.getX() <= 9 || cord.getX() >= 0){
                returnedCoordinates.add(cord);
            }
        }
        return returnedCoordinates;
    }
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    public Coordinate getCoordinate() {
        return coordinate;
    }
    public Boolean getColor() {
        return color;
    }
}
