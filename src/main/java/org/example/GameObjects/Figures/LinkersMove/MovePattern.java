package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public interface MovePattern {
    ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board);
    ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board);
    ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board);
}
