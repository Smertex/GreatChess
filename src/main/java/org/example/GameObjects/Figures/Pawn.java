package org.example.GameObjects.Figures;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.Figures.LinkersMove.MovePattern;
import org.example.GameObjects.Figures.LinkersMove.PawnMove;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Pawn extends Figure {
    public Pawn(Boolean color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public ArrayList<Coordinate> existenceMove(Board board) {
        MovePattern movePattern = new PawnMove();
        ArrayList<Coordinate> coordinates =  new ArrayList<>(movePattern.checkingMoves(this.coordinate));
        coordinates = checkingEmptinessSquare(coordinates, board);

        return coordinates;
    }

    @Override
    protected ArrayList<Coordinate> checkingEmptinessSquare(ArrayList<Coordinate> coordinates, Board board) {
        coordinates = boundaryOverrunCheck(coordinates);
        ArrayList<Coordinate> returnedCoordinates = new ArrayList<>();

        for(Coordinate cord: coordinates){
            if(cord.getX() != this.coordinate.getX() && board.getFigure(cord.getY(), cord.getX()) != null){
                if(board.getFigure(cord.getY(), cord.getX()).getColor()){
                    returnedCoordinates.add(cord);
                }
            } else if(cord.getX() == this.coordinate.getX() && board.getFigure(cord.getY(), cord.getX()) == null) {
                returnedCoordinates.add(cord);
            }
        }

        return returnedCoordinates;
    }

    //Пешка
}
