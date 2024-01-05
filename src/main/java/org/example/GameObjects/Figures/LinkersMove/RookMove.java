package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

import java.util.ArrayList;

public class RookMove implements MovePattern {

    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = moveBuilder(new ArrayList<>(), figure, board);
        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        LengthMove lengthMove = new LengthMove();
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(1, 0), board));
        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(-1, 0), board));
        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(0, 1), board));
        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(0, -1), board));


        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board) {
        return checkingExistenceMoves(figure, board);
    }


}
