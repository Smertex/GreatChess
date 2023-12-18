package org.example.GameObjects.Figures;

public class Coordinate {
    private Integer x;
    private Integer y;
    public Coordinate(Integer x, Integer y){
        setX(x);
        setY(y);
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    public Integer getX() {
        return x;
    }
    public Integer getY() {
        return y;
    }
}
