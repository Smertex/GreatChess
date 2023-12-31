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
    public abstract ArrayList<Coordinate> imaginaryMoves(Board board);
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
