package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public interface MovePattern {
    ArrayList<Coordinate> checkingMoves(Board board, Coordinate coordinate, Boolean color);
}
