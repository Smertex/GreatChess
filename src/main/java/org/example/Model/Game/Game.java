package org.example.Model.Game;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Figures.King;
import org.example.Model.OtherObjects.Board;
import org.example.Model.Players.Player;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private final Player firstPlayer;
    private final Player secondPlayer;
    private Player currentPlayer;
    private Boolean swapMove = true;
    private Board board;
    public void actionPlayer(Coordinate basicCoordinate, Coordinate targetCoordinate){
        definitionPlayer();
    }
    public void shiftFigure(Coordinate basicCoordinate, Coordinate targetCoordinate){
        if(!checkShah()) {
            board.shiftFigure(basicCoordinate, targetCoordinate);
        } else {
            board.shiftFigure(basicCoordinate, targetCoordinate);
            System.out.println("Шах");
            availableMoves();
        }
        definitionPlayer();
    }
    public boolean choiceFigure(Coordinate figureCoordinate){
        return board.getFigure(figureCoordinate.getY(), figureCoordinate.getX()) != null
                && board.getFigure(figureCoordinate.getY(), figureCoordinate.getX()).getColor() == currentPlayer.isColor();
    }
    private void definitionPlayer() {
        swapMove = !swapMove;
        currentPlayer = swapMove ? (firstPlayer.isColor() ? firstPlayer : secondPlayer) : (firstPlayer.isColor() ? secondPlayer : firstPlayer);
    }
    private boolean checkShah(){
        boolean color = currentPlayer.isColor();

        for(int y = 0; y <= 9; y++){
            for(int x = 0; x <= 9; x++){
                if(board.getFigure(y, x) instanceof King && board.getFigure(y, x).getColor() != color){
                    King king = (King) board.getFigure(y, x);
                    return king.checkShah(board);
                }
            }
        }
        return false;
    }
    private ArrayList<Coordinate> availableMoves(){
        return null;
    }
    public Board getBoard(){
        return this.board;
    }
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    public Game(){
        firstPlayer = new Player("Player 1", true);
        secondPlayer = new Player("Player 2", false);
        currentPlayer = firstPlayer;

        board = new Board();
    }
}
