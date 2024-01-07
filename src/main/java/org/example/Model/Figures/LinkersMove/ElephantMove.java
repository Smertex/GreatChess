package org.example.Model.Figures.LinkersMove;

import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class ElephantMove implements MovePattern {
    @Override
    public ArrayList<Coordinate> checkingExistenceMoves(Figure figure, Board board) {
        ArrayList<Coordinate> coordinates = moveBuilder(new ArrayList<>(), figure, board);
        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.checkFriendlyAttack(coordinates, figure, board);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> moveBuilder(ArrayList<Coordinate> coordinates, Figure figure, Board board) {
        LengthMove lengthMove = new LengthMove();
        Coordinate figureCoordinate = figure.getCoordinate();

        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(1, 1), board));
        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(1, -1), board));
        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(-1, 1), board));
        coordinates.addAll(lengthMove.moveInTarget(figureCoordinate, new Coordinate(-1, -1), board));


        DeleteImpossibleCoordinates deleteImpossibleCoordinates = new DeleteImpossibleCoordinates();
        coordinates = deleteImpossibleCoordinates.boundaryOverrunCheck(coordinates);

        return coordinates;
    }

    @Override
    public ArrayList<Coordinate> imaginaryMoves(Figure figure, Board board) {
        return moveBuilder(new ArrayList<>(), figure, board);
    }
}
