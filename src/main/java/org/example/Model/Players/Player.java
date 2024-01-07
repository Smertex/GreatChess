package org.example.Model.Players;

public class Player {
    private String playerName;
    //true - white figure, false - black figure
    private boolean color;
    public Player(String playerName, boolean color){
        this.playerName = playerName;
        this.color = color;

    }
    public String getPlayerName() {
        return playerName;
    }
    public boolean isColor() {
        return color;
    }
}
