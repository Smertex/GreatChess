package org.example.Window;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import org.example.GameObjects.Figures.FuguresUtils.Coordinate;
import org.example.GameObjects.OtherObjects.Board;

public class RenderingBoard {
    public GridPane boardRendering(Board board){
        GridPane boardGUI = new GridPane();

        int sizeSquare = 100;

        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                Rectangle rectangle = new Rectangle(sizeSquare, sizeSquare);

                if(!Board.isSquareDark(new Coordinate(i, j))){
                    rectangle.setFill(Color.GREY);
                } else {
                    rectangle.setFill(Color.WHITE);
                }

                boardGUI.add(rectangle, j, i);

                if(board.getFigure(i, j) != null){
                    Text image = new Text(String.valueOf(board.getFigure(i, j).getImage()));
                    image.setFont(Font.font((double) sizeSquare / 2));


                    if(board.getFigure(i, j).getColor()){
                        image.setFill(Color.WHITE);
                        image.setStrokeWidth(0.5);
                        image.setStroke(Color.BLACK);
                    } else {
                        image.setFill(Color.BLACK);
                    }

                    boardGUI.add(image, j, i);
                    GridPane.setHalignment(image, HPos.CENTER);
                    GridPane.setValignment(image, VPos.CENTER);
                }
            }
        }

        return boardGUI;
    }
}
