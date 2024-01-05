package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.CompositeMove;
import org.example.GameObjects.Figures.LinkersMove.ElephantMove;
import org.example.GameObjects.Figures.LinkersMove.HorseMove;
import org.example.GameObjects.Figures.LinkersMove.RookMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class FightingVehicle extends Figure {
    public FightingVehicle(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
        setImage('F');
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        CompositeMove compositeMove = new CompositeMove();
        compositeMove.addMovePatterns(new RookMove());
        compositeMove.addMovePatterns(new HorseMove());

        return compositeMove.coordinatesComposite(this, board);
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Board board) {
        return existenceMove(board);
    }


    //Боевая машина
}
