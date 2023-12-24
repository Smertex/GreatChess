package org.example.GameObjects.OtherObjects;

import org.example.GameObjects.Figures.*;

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
        board = boardBuilder.returnedBoard();
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
    public static boolean isSquareDark(Coordinate coordinate){
        return (coordinate.getY() + coordinate.getX()) % 2 == 0;
    }
}
