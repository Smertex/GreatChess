package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.LinkersMove.HorseMove;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Horse extends Figure {
    public Horse(Boolean color, Boolean condition, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new HorseMove();

        return new ArrayList<>(movePattern.checkingMoves(board, this.coordinate, this.color));
    }


    //Лошадь
}
