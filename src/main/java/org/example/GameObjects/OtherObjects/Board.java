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
        Figure rookW1 = new Rook(true, true);
        Figure rookW2 = new Rook(true, true);
        Figure horseW1 = new Horse(true, true);
        Figure horseW2 = new Horse(true, true);
        Figure elephantW1 = new Elephant(true, true);
        Figure elephantW2 = new Elephant(true, true);
        Figure vizierW = new Vizier(true, true);
        Figure giraffeW = new Giraffe(true, true);
        Figure kingW = new King(true, true);
        Figure queenW = new Queen(true, true);
        Figure vehicleW1 = new FightingVehicle(true, true);
        Figure vehicleW2 = new FightingVehicle(true, true);

        Figure rookB1 = new Rook(false, true);
        Figure rookB2 = new Rook(false, true);
        Figure horseB1 = new Horse(false, true);
        Figure horseB2 = new Horse(false, true);
        Figure elephantB1 = new Elephant(false, true);
        Figure elephantB2 = new Elephant(false, true);
        Figure vizierB = new Vizier(false, true);
        Figure giraffeB = new Giraffe(false, true);
        Figure kingB = new King(false, true);
        Figure queenB = new Queen(false, true);
        Figure vehicleB1 = new FightingVehicle(false, true);
        Figure vehicleB2 = new FightingVehicle(false, true);

        this.board = new Figure[][]{
                {rookW1, horseW1, elephantW1, vizierW, giraffeW, kingW, queenW, elephantW2, horseW2, rookW2},
                {null, null, null, null, vehicleW1, vehicleW2, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, vehicleB1, vehicleB2, null, null, null, null},
                {rookB1, horseB1, elephantB1, queenB, kingB, giraffeB, vizierB, elephantB2, horseB2, rookB2},
        };

        for(int i = 1; i < 10; i += 7){
            for(int j = 0; j < 10; j++){
                if(i == 1 && this.board[i][j] == null){
                    this.board[i][j] = new Pawn(true, true);
                } else if (i == 8 && this.board[i][j] == null){
                    this.board[i][j] = new Pawn(false, true);
                }
            }
        }
    }
    public void setBoard(Figure[][] board){
        this.board = board;
    }
    public Figure[][] getBoard(){
        return this.board;
    }
}
