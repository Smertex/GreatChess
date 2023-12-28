package org.example.GameObjects.Figures.FuguresUtils;

public class Coordinate {
    private Integer x, y;
    public Coordinate(Integer y, Integer x){
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
