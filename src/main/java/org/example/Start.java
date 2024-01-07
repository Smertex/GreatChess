package org.example;

import org.example.Model.Game.Game;
import org.example.Controller.Controller;

public class Start {
    public static void main(String[] args) {
        Game game = new Game();
        game.actionPlayer(null, null);

        Controller controller = new Controller();
        controller.execute();
    }
}
