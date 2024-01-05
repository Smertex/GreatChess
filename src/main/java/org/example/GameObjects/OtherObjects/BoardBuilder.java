package org.example.GameObjects.OtherObjects;

import org.example.GameObjects.Figures.*;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;

public class BoardBuilder {
    public Figure[][] gameBoard(){
        Figure[][] board;

        Figure rookW1 = new Rook(true, new Coordinate(0, 0));
        Figure rookW2 = new Rook(true, new Coordinate(0, 9));
        Figure horseW1 = new Horse(true, new Coordinate(0, 1));
        Figure horseW2 = new Horse(true, new Coordinate(0, 8));
        Figure elephantW1 = new Elephant(true, new Coordinate(0, 2));
        Figure elephantW2 = new Elephant(true, new Coordinate(0, 7));
        Figure vizierW = new Vizier(true, new Coordinate(0, 3));
        Figure giraffeW = new Giraffe(true, new Coordinate(0, 4));
        Figure kingW = new King(true, new Coordinate(0, 5));
        Figure queenW = new Queen(true, new Coordinate(0, 6));
        Figure vehicleW1 = new FightingVehicle(true, new Coordinate(1, 4));
        Figure vehicleW2 = new FightingVehicle(true, new Coordinate(1, 5));

        Figure rookB1 = new Rook(false, new Coordinate(9, 0));
        Figure rookB2 = new Rook(false, new Coordinate(9, 9));
        Figure horseB1 = new Horse(false, new Coordinate(9, 1));
        Figure horseB2 = new Horse(false, new Coordinate(9, 8));
        Figure elephantB1 = new Elephant(false, new Coordinate(9, 2));
        Figure elephantB2 = new Elephant(false, new Coordinate(9, 7));
        Figure vizierB = new Vizier(false, new Coordinate(9, 6));
        Figure giraffeB = new Giraffe(false, new Coordinate(9, 5));
        Figure kingB = new King(false, new Coordinate(9, 4));
        Figure queenB = new Queen(false, new Coordinate(9, 3));
        Figure vehicleB1 = new FightingVehicle(false, new Coordinate(8, 4));
        Figure vehicleB2 = new FightingVehicle(false, new Coordinate(8, 5));

        Figure testFigure1 = new Rook(true, new Coordinate(3, 2));
        Figure testFigure2 = new Pawn(false, new Coordinate(2, 2));
        Figure testFigure3 = new Giraffe(true, new Coordinate(4, 4));

        board = new Figure[][]{
                {rookW1, horseW1, elephantW1, vizierW, giraffeW, kingW, queenW, elephantW2, horseW2, rookW2},
                {null, null, null, null, vehicleW1, vehicleW2, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, testFigure3, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, vehicleB1, vehicleB2, null, null, null, null},
                {rookB1, horseB1, elephantB1, queenB, kingB, giraffeB, vizierB, elephantB2, horseB2, rookB2},
        };

        for(int i = 1; i < 10; i += 7){
            for(int j = 0; j < 10; j++){
                if(i == 1 && board[i][j] == null){
                    board[i][j] = new Pawn(true, new Coordinate(i, j));
                } else if (i == 8 && board[i][j] == null){
                    board[i][j] = new Pawn(false, new Coordinate(i, j));
                }
            }
        }

        return board;

    }

    public Figure[][] testBoardForCheckMoveKing(){
        Figure[][] board;

        Figure kingW = new King(true, new Coordinate(4, 3));
        Figure pawnW1 = new Pawn(true, new Coordinate(3, 4));

        Figure horseB1 = new Horse(false, new Coordinate(3,2));
        Figure pawnB1 = new Pawn(false, new Coordinate(5, 1));
        Figure elephantB1 = new Elephant(false, new Coordinate(8, 8));
        Figure kingB = new King(false, new Coordinate(6,3));

        board = new Figure[][]{
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, pawnW1, null, null, null, null, null},
                {null, null, null, kingW, null, null, null, null, null, null},
                {null, pawnB1, null, null, null, null, null, null, null, null},
                {null, null, null, kingB, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, elephantB1, null},
                {null, null, null, null, null, null, null, null, null, null},
        };

        return board;
    }

}
