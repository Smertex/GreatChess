package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Giraffe extends Figure {
    public Giraffe(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, condition, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        return null;
    }

    //Жираф
}