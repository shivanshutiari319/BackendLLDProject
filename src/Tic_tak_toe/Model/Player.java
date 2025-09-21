package Tic_tak_toe.Model;

public abstract class Player {
   private  int id;
   private  String name;
    private PlayerType playerType;
    private Symbol symbol;

    public Player(PlayerType playerType, Symbol symbol,String name  , int id) {
        this.playerType = playerType;
        this.symbol = symbol;
        this.name = name;
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public abstract Move makeMove(Board board);
}
