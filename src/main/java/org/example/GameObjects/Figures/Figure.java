package org.example.GameObjects.Figures;

public abstract class Figure {
    protected Boolean condition;
    protected Boolean color;
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
