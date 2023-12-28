package org.example.GameObjects.Figures.FuguresUtils;

public class Coordinate {
    private int x, y;
    public Coordinate(int y, int x){
        setX(x);
        setY(y);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
