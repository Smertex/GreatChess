package org.example.Model.Figures;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.LinkersMove.CompositeMove;
import org.example.Model.Figures.LinkersMove.ElephantMove;
import org.example.Model.Figures.LinkersMove.RookMove;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class Queen extends Figure {
    public Queen(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('♛');
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        CompositeMove compositeMove = new CompositeMove();
        compositeMove.addMovePatterns(new RookMove());
        compositeMove.addMovePatterns(new ElephantMove());

        return compositeMove.coordinatesComposite(this, board);

    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        return existenceMove(board);
    }


    //Ферзь
}
