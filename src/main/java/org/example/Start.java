package org.example;

import javafx.stage.Stage;
import org.example.Controller.GameController.GameController;
import org.example.Model.Game.Game;
import org.example.Viev.BoardGraphics;

public class Start extends javafx.application.Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Great chess");

        Game game = new Game();
        BoardGraphics boardGraphics = new BoardGraphics(100);

        GameController controller = new GameController(game, boardGraphics);
        stage.setScene(controller.getScene());

        stage.show();
    }

}
