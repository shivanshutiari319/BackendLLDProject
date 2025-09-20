package Tic_tak_toe.Model;

public class Bot extends Player {
    BotDiffculty botDiffculty;

    public Bot(PlayerType playerType, Symbol symbol,int id,String name,BotDiffculty botDiffculty ) {
        super(playerType, symbol, name, id);
        this.botDiffculty = botDiffculty;


    }



}
