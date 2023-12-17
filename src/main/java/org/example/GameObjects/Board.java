package org.example.GameObjects;

import org.example.GameObjects.Figures.Figure;

public class Board {
    private Figure[][] board;
    public Board() {
        createBoard();
    }
    private void createBoard(){
        this.board = new Figure[10][10];
    }

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
}
