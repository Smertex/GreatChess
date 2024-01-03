package org.example.Window;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;
import java.util.ArrayList;

public class ClickReactions {

    public static void RenderingExistenceMoveSquare(Board board, GridPane boardGUI, Figure figure, int sizeSquare){
        ArrayList<Coordinate> coordinates = figure.existenceMove(board);

        for(Coordinate cord: coordinates){
            Rectangle existenceMoveSquare = new Rectangle(sizeSquare, sizeSquare);
            existenceMoveSquare.setFill(Color.DARKSEAGREEN);
            existenceMoveSquare.setOpacity(0.8);

            boardGUI.add(existenceMoveSquare, cord.getX(), cord.getY());
        }


    }

}
