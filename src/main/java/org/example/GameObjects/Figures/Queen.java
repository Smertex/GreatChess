package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.CompositeMove;
import org.example.GameObjects.Figures.LinkersMove.ElephantMove;
import org.example.GameObjects.Figures.LinkersMove.RookMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Queen extends Figure {
    public Queen(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        CompositeMove compositeMove = new CompositeMove();
        compositeMove.addMovePatterns(new RookMove());
        compositeMove.addMovePatterns(new ElephantMove());
        ArrayList<Coordinate> coordinates = compositeMove.coordinatesComposite(this.coordinate);
        coordinates = checkingEmptinessSquare(coordinates, board);


        return coordinates;

    }


    //Ферзь
}
