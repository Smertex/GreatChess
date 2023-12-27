package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.ElephantMove;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Elephant extends Figure {
    public Elephant(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new ElephantMove();

        return null;
    }
    //Слон
}
