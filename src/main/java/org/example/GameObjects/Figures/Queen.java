package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Queen extends Figure {
    public Queen(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        return null;
    }


    //Ферзь
}
