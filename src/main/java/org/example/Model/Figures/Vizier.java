package org.example.Model.Figures;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.LinkersMove.CompositeMove;
import org.example.Model.Figures.LinkersMove.ElephantMove;
import org.example.Model.Figures.LinkersMove.HorseMove;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class Vizier extends Figure {
    public Vizier(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('V');
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        CompositeMove compositeMove = new CompositeMove();
        compositeMove.addMovePatterns(new ElephantMove());
        compositeMove.addMovePatterns(new HorseMove());

        return compositeMove.coordinatesComposite(this, board);
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        return existenceMove(board);
    }

    //Визирь
}
