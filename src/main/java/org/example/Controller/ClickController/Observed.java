package org.example.Controller.ClickController;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;

public interface Observed {
    void shiftFigure(Coordinate basicCoordinate, Coordinate targetCoordinate);
    boolean availableSquare(int col, int row);
    Figure getFigure(int col, int row);
}
