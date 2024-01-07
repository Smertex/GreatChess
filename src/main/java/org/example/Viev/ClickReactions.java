package org.example.Viev;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class ClickReactions {

    public static void RenderingExistenceMoveSquare(Board board, GridPane boardGUI, Figure figure, int sizeSquare){
        ArrayList<Coordinate> coordinates = figure.existenceMove(board);

        for(Coordinate cord: coordinates){
            Rectangle existenceMoveSquare = new Rectangle(sizeSquare, sizeSquare);
            if(board.getFigure(cord.getY(), cord.getX()) != null){
                existenceMoveSquare.setFill(Color.rgb(210, 77, 77));
                existenceMoveSquare.setOpacity(0.6);
            } else {
                existenceMoveSquare.setFill(Color.rgb(107, 175, 84));
                existenceMoveSquare.setOpacity(0.6);
            }
            boardGUI.add(existenceMoveSquare, cord.getX(), cord.getY());
            existenceMoveSquare.setOnMouseClicked(e -> {
                board.shiftFigure(figure.getCoordinate(), cord);
                refrash(board, boardGUI);
            });
        }


    }

    public static void refrash(Board board, GridPane boardGUI){
        RenderingBoard renderingBoard = new RenderingBoard();

        boardGUI.getChildren().clear();
        boardGUI.getChildren().add(renderingBoard.boardRendering(board));
    }

}
