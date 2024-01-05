package org.example.Window;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.GameObjects.OtherObjects.Board;

public class Application extends javafx.application.Application {
    public static void main(String[] args) {
        javafx.application.Application.launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Great chess");
        RenderingBoard renderingBoard = new RenderingBoard();

        Scene scene = new Scene(renderingBoard.boardRendering(new Board()));
        stage.setScene(scene);

        stage.show();
    }

}
