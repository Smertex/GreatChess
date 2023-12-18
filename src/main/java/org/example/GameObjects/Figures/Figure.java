package org.example.GameObjects.Figures;

public abstract class Figure {
    //true - white figure, false - black figure
    protected Boolean color;
    protected Boolean condition;
    protected int x, y;
    public Figure(Boolean color, Boolean condition){
        setColor(color);
        setCondition(condition);
    }
    abstract void movePattern();
    public void setCondition(Boolean condition) {
        this.condition = condition;
    }
    public void setColor(Boolean color) {
        this.color = color;
    }
    public Boolean getColor() {
        return color;
    }
    public Boolean getCondition() {
        return condition;
    }
}
