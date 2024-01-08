package org.example.Controller.GameController;

import javafx.scene.Scene;
import org.example.Controller.BasicController.BasicController;
import org.example.Model.Figures.Figure;
import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Game.Game;
import org.example.Viev.BoardGraphics;

public class GameController implements BasicController {
    private Game game;
    private BoardGraphics boardGraphics;

    public GameController(Game game, BoardGraphics boardGraphics){
        this.game = game;
        this.boardGraphics = boardGraphics;
        getBoardGraphics().createGridPane(getGame().getBoard(), this);
    }
    public void shiftFigure(Coordinate basicCoordinate, Coordinate targetCoordinate) {
        game.shiftFigure(basicCoordinate, targetCoordinate);
    }
    public boolean availableSquare(int col, int row) {
        return getGame().choiceFigure(new Coordinate(row, col));
    }
    public Figure getFigure(int col, int row) {
        return game.getBoard().getFigure(row, col);
    }
    public boolean checkShah(){
        return game.checkShah();
    }
    public Figure getKing(){
        return game.getKing();
    }
    @Override
    public Game getGame() {
        return game;
    }
    @Override
    public BoardGraphics getBoardGraphics() {
        return boardGraphics;
    }
    @Override
    public void setGame(Game game) {
        this.game = game;
    }
    @Override
    public void setBoardGraphics(BoardGraphics boardGraphics) {
        this.boardGraphics = boardGraphics;
    }
    public Scene getScene(){
        return new Scene(getBoardGraphics().getBoardGUI());
    }
}
