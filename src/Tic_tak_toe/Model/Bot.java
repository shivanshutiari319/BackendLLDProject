package Tic_tak_toe.Model;

public class Bot extends Player {
    BotDiffculty botDiffculty;
    public Bot(PlayerType playerType, Symbol symbol) {
        super(playerType, symbol);
    }

    public BotDiffculty getDifficulty(BotDiffculty botDiffculty){
        return  botDiffculty;
    }

}
