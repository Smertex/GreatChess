package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.KingMove;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class King extends Figure {
    public King(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('♚');
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new KingMove();
        ArrayList<Coordinate> coordinates = movePattern.checkingExistenceMoves(this, board);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        return null;
    }


    //Король
}
