package org.example.Viev;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import org.example.Controller.ClickController.Observed;
import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.OtherObjects.Board;

import java.util.ArrayList;

public class BoardGraphics{
    private GridPane boardGUI;
    private int sizeSquare;
    public BoardGraphics(int sizeSquare){
        this.sizeSquare = sizeSquare;
        this.boardGUI = new GridPane();
    }
    public void createGridPane(Board board, Observed observed){
        rendering(board);
        setClick(board, observed);
    }
    private void rendering(Board board){
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                Rectangle rectangle = new Rectangle(sizeSquare, sizeSquare);

                if(!Board.isSquareDark(new Coordinate(i, j))){
                    rectangle.setFill(Color.GREY);
                } else {
                    rectangle.setFill(Color.WHITE);
                }
                boardGUI.add(rectangle, j, i);

                if (board.getFigure(i, j) != null) {
                    Text image = new Text(String.valueOf(board.getFigure(i, j).getImage()));
                    image.setFont(Font.font((double) sizeSquare / 2));

                    if (board.getFigure(i, j).getColor()) {
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
    }
    private void setClick(Board board, Observed observed){
        boardGUI.getChildren().forEach(event -> {
            event.setOnMouseClicked(e -> {
                int column = boardGUI.getColumnIndex(event);
                int row = boardGUI.getRowIndex(event);

                if(observed.availableSquare(column, row)){
                    createGridPane(board, observed);
                    renderingMoveOnClick(board, observed.getFigure(column, row), observed);
                }
           });
        });
    }
    private void renderingMoveOnClick(Board board, Figure figure, Observed observed) {
        ArrayList<Coordinate> coordinates = figure.existenceMove(board);

        for (Coordinate cord : coordinates) {
            Rectangle existenceMoveSquare = new Rectangle(sizeSquare, sizeSquare);
            if (board.getFigure(cord.getY(), cord.getX()) != null) {
                existenceMoveSquare.setFill(Color.rgb(210, 77, 77));
                existenceMoveSquare.setOpacity(0.6);
            } else {
                existenceMoveSquare.setFill(Color.rgb(107, 175, 84));
                existenceMoveSquare.setOpacity(0.6);
            }
            boardGUI.add(existenceMoveSquare, cord.getX(), cord.getY());
            existenceMoveSquare.setOnMouseClicked(e -> {
                observed.shiftFigure(figure.getCoordinate(), cord);
                createGridPane(board, observed);
            });
        }
    }
    public Node getNode(int col, int row){
        for(Node node: boardGUI.getChildren()){
            if(GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row){
                return node;
            }
        }
        return null;
    }
    public GridPane getBoardGUI() {
        return boardGUI;
    }
}
