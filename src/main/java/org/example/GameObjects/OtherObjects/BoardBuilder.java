package org.example.GameObjects.OtherObjects;

import org.example.GameObjects.Figures.*;

public class BoardBuilder {

    public Figure[][] returnedBoard(){
        Figure[][] board = new Figure[10][10];

        Figure rookW1 = new Rook(true, true, new Coordinate(0, 0));
        Figure rookW2 = new Rook(true, true, new Coordinate(0, 9));
        Figure horseW1 = new Horse(true, true, new Coordinate(0, 1));
        Figure horseW2 = new Horse(true, true, new Coordinate(0, 8));
        Figure elephantW1 = new Elephant(true, true, new Coordinate(0, 2));
        Figure elephantW2 = new Elephant(true, true, new Coordinate(0, 7));
        Figure vizierW = new Vizier(true, true, new Coordinate(0, 3));
        Figure giraffeW = new Giraffe(true, true, new Coordinate(0, 4));
        Figure kingW = new King(true, true, new Coordinate(0, 5));
        Figure queenW = new Queen(true, true, new Coordinate(0, 6));
        Figure vehicleW1 = new FightingVehicle(true, true, new Coordinate(1, 4));
        Figure vehicleW2 = new FightingVehicle(true, true, new Coordinate(1, 5));

        Figure rookB1 = new Rook(false, true, new Coordinate(9, 0));
        Figure rookB2 = new Rook(false, true, new Coordinate(9, 9));
        Figure horseB1 = new Horse(false, true, new Coordinate(9, 1));
        Figure horseB2 = new Horse(false, true, new Coordinate(9, 8));
        Figure elephantB1 = new Elephant(false, true, new Coordinate(9, 2));
        Figure elephantB2 = new Elephant(false, true, new Coordinate(9, 7));
        Figure vizierB = new Vizier(false, true, new Coordinate(9, 6));
        Figure giraffeB = new Giraffe(false, true, new Coordinate(0, 5));
        Figure kingB = new King(false, true, new Coordinate(9, 4));
        Figure queenB = new Queen(false, true, new Coordinate(9, 3));
        Figure vehicleB1 = new FightingVehicle(false, true, new Coordinate(8, 4));
        Figure vehicleB2 = new FightingVehicle(false, true, new Coordinate(8, 5));

        board = new Figure[][]{
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
                if(i == 1 && board[i][j] == null){
                    board[i][j] = new Pawn(true, true, new Coordinate(i, j));
                } else if (i == 8 && board[i][j] == null){
                    board[i][j] = new Pawn(false, true, new Coordinate(i, j));
                }
            }
        }

        return board;

    }

}
