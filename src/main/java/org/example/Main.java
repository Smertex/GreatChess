package org.example;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        ArrayList<Coordinate> coordinates = board.getFigure(1, 2).existenceMove(board);

        int a = 123;
    }
}
