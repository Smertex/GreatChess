package org.example.GameObjects.Figures;

public abstract class Figure {
    //true - white figure, false - black figure
    protected final Boolean color;
    protected Boolean condition;
    protected Coordinate coordinate;
    public Figure(Boolean color, Boolean condition, Coordinate coordinate){
        this.color = color;
        setCondition(condition);
        setCoordinate(coordinate);
    }
    abstract void movePattern();
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
