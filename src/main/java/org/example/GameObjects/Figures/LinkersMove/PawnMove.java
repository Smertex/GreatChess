package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class PawnMove implements MovePattern{
    @Override
    public ArrayList<Coordinate> checkingMoves(Board board, Coordinate coordinate, Boolean color) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        if(board.getFigure(coordinate.getY() + 1, coordinate.getX()) == null){
            coordinates.add(new Coordinate(coordinate.getY() + 1, coordinate.getX()));
        }
        if(board.getFigure(coordinate.getY() + 1, coordinate.getX() + 1).getColor() != color){
            coordinates.add(new Coordinate(coordinate.getY() + 1, coordinate.getX() + 1));
        }
        if(board.getFigure(coordinate.getY() + 1, coordinate.getX() - 1).getColor() != color){
            coordinates.add(new Coordinate(coordinate.getY() + 1, coordinate.getX() - 1));
        }

        return coordinates;
    }

}
