package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

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
