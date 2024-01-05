package org.example.GameObjects.OtherObjects;

import org.example.GameObjects.Figures.*;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;

import java.util.ArrayList;

public class Board {
/*
        a b c d e f g h i j
 White  1R H E V G K Q E H R
        2P P P P F F P P P P
        3
        4
        5
        6
        7
        8
        9P P P P F F P P P P
 Black 10R H E Q K G V E H R

*/
    private Figure[][] board;
    public Board() {
        createBoard();
    }
    private void createBoard(){
        BoardBuilder boardBuilder = new BoardBuilder();
        board = boardBuilder.testBoardForCheckMoveKing();
        //board = boardBuilder.gameBoard();
    }
    public void setBoard(Figure[][] board){
        this.board = board;
    }
    public Figure[][] getBoard(){
        return this.board;
    }
    public Figure getFigure(Integer y, Integer x){
        return board[y][x];
    }
    public ArrayList<Coordinate> movesFigureIsColor(boolean color){
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for(int y = 0; y <= 9; y++){
            for(int x = 0; x <= 9; x++){
                if(this.getFigure(y, x) != null && this.getFigure(y, x).getColor() != color){
                    coordinates.addAll(this.getFigure(y, x).imaginaryMoves(this));
                }
            }
        }

        return  coordinates;
    }
    public Boolean isSquareAttacked(Coordinate coordinate, boolean color){
        ArrayList<Coordinate> coordinates = movesFigureIsColor(color);

        for(Coordinate cord: coordinates){
            if(coordinate.equals(cord)){
                return true;
            }
        }

        return false;
    }
    public static boolean isSquareDark(Coordinate coordinate){
        return (coordinate.getY() + coordinate.getX()) % 2 == 0;
    }
}
