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

    public Symbol getSymbol() {
        return symbol;
    }
}
