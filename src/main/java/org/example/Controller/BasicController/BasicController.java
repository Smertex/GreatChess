package org.example.Controller.BasicController;

import org.example.Model.Game.Game;
import org.example.Viev.BoardGraphics;

public interface BasicController {
    Game getGame();
    BoardGraphics getBoardGraphics();
    void setGame(Game game);
    void setBoardGraphics(BoardGraphics boardGraphics);
}
