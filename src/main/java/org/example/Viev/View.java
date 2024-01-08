package org.example.Viev;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import org.example.Model.OtherObjects.Board;

public class View {
    private BoardGraphics rendering;
    private int size;
    public View(){
        size = 100;
        rendering = new BoardGraphics(size);
    }
//    public Scene window(Board board){
//        rendering.createGridPane(board);
//        return new Scene(rendering.getBoardGUI());
//    }
    public BoardGraphics getRenderingBoard() {
        return rendering;
    }
}
