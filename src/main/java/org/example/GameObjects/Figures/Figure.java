package org.example.GameObjects.Figures;

import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public abstract class Figure {
    //true - white figure, false - black figure
    protected final Boolean color;
    protected Boolean condition;
    protected Coordinate coordinate;
    public Figure(Boolean color, Boolean condition, Coordinate coordinate){
        this.color = color;
        this.condition = condition;
        this.coordinate = coordinate;
    }
    public void displacement(Coordinate coordinate){
        this.coordinate = coordinate;
    }
    public abstract ArrayList<Coordinate> existenceMove(Board board);
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
    public void setCondition(Boolean condition) {
        this.condition = condition;
    }
    public Boolean getColor() {
        return color;
    }
    public Boolean getCondition() {
        return condition;
    }
}
