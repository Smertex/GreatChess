package org.example.Model.Game;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.King;
import org.example.Model.OtherObjects.Board;
import org.example.Model.Players.Player;

public class LogicGame {
    private Board board;
    private Player player;
    public LogicGame(){
        this.board = new Board();
    }
    public void move(Coordinate basicCoordinate, Coordinate targetCoordinate) {

    }
    public void setPlayer(Player player){
        this.player = player;
    }
    private boolean choiceFigure(Coordinate figureCoordinate){
        if(board.getFigure(figureCoordinate.getY(), figureCoordinate.getX()) != null
                && board.getFigure(figureCoordinate.getY(), figureCoordinate.getX()).getColor() == player.isColor()){
            return true;
        } else {
            return false;
        }
    }
    private boolean checkShah(){
        boolean color = player.isColor();

        for(int y = 0; y <= 9; y++){
            for(int x = 0; x <= 9; x++){
                if(board.getFigure(y, x) instanceof King && board.getFigure(y, x).getColor() == color){
                    King king = (King) board.getFigure(y, x);
                    return king.checkShah(board);
                }
            }
        }
        return false;
    }
}
