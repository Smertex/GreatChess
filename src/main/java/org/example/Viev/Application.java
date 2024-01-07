package org.example.Viev;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.Model.OtherObjects.Board;

public class Application extends javafx.application.Application {
    public void startApplication() {
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
