package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public interface MovePattern {
    ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board);
    ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board);
    ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board);
}
