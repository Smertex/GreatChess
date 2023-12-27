package org.example.GameObjects.Figures;

import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class King extends Figure {
    public King(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        return null;
    }


    //Король
}
