package org.example.Model.Game;

import org.example.Model.Figures.FuguresUtils.Coordinate;
import org.example.Model.Players.Player;

import java.util.Random;

public class Game {
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final LogicGame logicGame;
    private Boolean swapMove = true;
    public void actionPlayer(Coordinate basicCoordinate, Coordinate targetCoordinate){
        definitionPlayer();
        logicGame.move(basicCoordinate, targetCoordinate);
    }
    private void definitionPlayer() {
        Player currentPlayer = swapMove ? (firstPlayer.isColor() ? firstPlayer : secondPlayer) : (firstPlayer.isColor() ? secondPlayer : firstPlayer);
        logicGame.setPlayer(currentPlayer);
        swapMove = !swapMove;
    }
    public Game() {
        Random random = new Random();
        boolean color = random.nextBoolean();

        this.firstPlayer = new Player("Player1", color);
        this.secondPlayer = new Player("Player2", !color);

        logicGame = new LogicGame();
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

        logicGame = new LogicGame();
    }

    public Game(String name1, String name2) {
        Random random = new Random();
        boolean color = random.nextBoolean();

        this.firstPlayer = new Player(name1, color);
        this.secondPlayer = new Player(name2, !color);

        logicGame = new LogicGame();
    }

    public Game(String name1, String name2, Boolean colorPlayer, Boolean color) {
        if (colorPlayer) {
            this.firstPlayer = new Player(name1, color);
            this.secondPlayer = new Player(name2, !color);
        } else {
            this.firstPlayer = new Player(name1, !color);
            this.secondPlayer = new Player(name2, color);
        }

        logicGame = new LogicGame();
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

        logicGame = new LogicGame();
    }
}
