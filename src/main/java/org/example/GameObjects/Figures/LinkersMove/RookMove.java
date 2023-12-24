package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class RookMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingMoves(Board board, Coordinate coordinate, Boolean color) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for(int i = coordinate.getY() - 1; i >= 0; i--){
            if(board.getFigure(i, coordinate.getX()) == null){
                coordinates.add(new Coordinate(i, coordinate.getX()));
            } else if(board.getFigure(i, coordinate.getX()).getColor() == color){
                break;
            } else if(board.getFigure(i, coordinate.getX()).getColor() != color){
                coordinates.add(new Coordinate(i, coordinate.getX()));
                break;
            }
        }
        for(int i = coordinate.getY() + 1; i <= 9; i++){
            if(board.getFigure(i, coordinate.getX()) == null){
                coordinates.add(new Coordinate(i, coordinate.getX()));
            } else if(board.getFigure(i, coordinate.getX()).getColor() == color){
                break;
            } else if(board.getFigure(i, coordinate.getX()).getColor() != color){
                coordinates.add(new Coordinate(i, coordinate.getX()));
                break;
            }
        }
        for(int i = coordinate.getX() - 1; i >= 0; i--){
            if(board.getFigure(coordinate.getY(), i) == null){
                coordinates.add(new Coordinate(coordinate.getY(), i));
            } if(board.getFigure(coordinate.getY(), i).getColor() == color){
                break;
            } else if(board.getFigure(coordinate.getY(), i).getColor() != color) {
                coordinates.add(new Coordinate(coordinate.getY(), i));
                break;
            }
        }
        for(int i = coordinate.getX() + 1; i <= 9; i++){
            if(board.getFigure(coordinate.getY(), i) == null){
                coordinates.add(new Coordinate(coordinate.getY(), i));
            } if(board.getFigure(coordinate.getY(), i).getColor() == color){
                break;
            } else if(board.getFigure(coordinate.getY(), i).getColor() != color) {
                coordinates.add(new Coordinate(coordinate.getY(), i));
                break;
            }
        }

        return coordinates;
    }
}
