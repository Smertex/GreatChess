package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Queen extends Figure {
    public Queen(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        return null;
    }


    //Ферзь
}
