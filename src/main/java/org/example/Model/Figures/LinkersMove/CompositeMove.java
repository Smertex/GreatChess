package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;
import java.util.List;

public class CompositeMove {
    private List<MovePattern> movePatterns = new ArrayList<>();
    public void addMovePatterns(MovePattern movePattern){
        this.movePatterns.add(movePattern);
    }
    public ArrayList<Coordinate> coordinatesComposite(Figure figure, Board board){
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for (MovePattern mp: movePatterns){
            coordinates.addAll(mp.checkingExistenceMoves(figure, board));
        }

        return coordinates;
    }
}
