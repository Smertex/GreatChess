package org.example.Game;

import org.example.GameObjects.Figures.Figure;
import org.example.GameObjects.OtherObjects.Board;
import org.example.Players.Player;

import java.util.Random;

public class Game {
    private Board board;
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final LogicGame logicGame;
    private Boolean swapMove = true;

    public void move() {
        if (swapMove) {
            //Ход игрока с белыми фигурами
            if (firstPlayer.isColor()) {

            } else {

            }
        } else {
            //Ход игрока с черными фигурами
            if (!firstPlayer.isColor()) {

            } else {

            }
        }
    }

    public Game() {
        Random random = new Random();
        boolean color = random.nextBoolean();

        this.firstPlayer = new Player("Player1", color);
        this.secondPlayer = new Player("Player2", !color);
        this.board = new Board();

        this.logicGame = new LogicGame(board);
    }

    public Game(String name, boolean playerName) {
        Random random = new Random();
        boolean color = random.nextBoolean();

        if (playerName) {
            this.firstPlayer = new Player(name, color);
            this.secondPlayer = new Player("Player2", !color);
        } else {
            this.firstPlayer = new Player("Player1", color);
            this.secondPlayer = new Player(name, !color);
        }
        this.board = new Board();

        this.logicGame = new LogicGame(board);
    }

    public Game(String name1, String name2) {
        Random random = new Random();
        boolean color = random.nextBoolean();

        this.firstPlayer = new Player(name1, color);
        this.secondPlayer = new Player(name2, !color);
        this.board = new Board();

        this.logicGame = new LogicGame(board);
    }

    public Game(String name1, String name2, Boolean colorPlayer, Boolean color) {
        if (colorPlayer) {
            this.firstPlayer = new Player(name1, color);
            this.secondPlayer = new Player(name2, !color);
        } else {
            this.firstPlayer = new Player(name1, !color);
            this.secondPlayer = new Player(name2, color);
        }
        this.board = new Board();

        this.logicGame = new LogicGame(board);
    }

    public Game(String name, boolean playerName, Boolean colorPlayer, Boolean color) {

        if (playerName) {
            if (colorPlayer) {
                this.firstPlayer = new Player(name, color);
                this.secondPlayer = new Player("Player2", !color);
            } else {
                this.firstPlayer = new Player(name, !color);
                this.secondPlayer = new Player("Player2", color);
            }
        } else {
            if (colorPlayer) {
                this.firstPlayer = new Player("Player1", color);
                this.secondPlayer = new Player(name, !color);
            } else {
                this.firstPlayer = new Player("Player1", !color);
                this.secondPlayer = new Player(name, color);
            }
        }
        this.board = new Board();

        this.logicGame = new LogicGame(board);
    }
}
