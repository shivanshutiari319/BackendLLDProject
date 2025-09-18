package Tic_tak_toe.Model;

public abstract class Player {

    public PlayerType playerType;
    public Symbol symbol;

    public Player(PlayerType playerType, Symbol symbol) {
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}
