package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Coordinate;

import java.util.ArrayList;

public interface MovePattern {
    ArrayList<Coordinate> checkingMoves(Coordinate coordinate);
}
