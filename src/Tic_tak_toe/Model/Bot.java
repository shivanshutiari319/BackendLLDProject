package Tic_tak_toe.Model;

import Tic_tak_toe.Strategy.BotDifficultStrategy;
import Tic_tak_toe.factory.BotDifficultyStrategyFactory;

public class Bot extends Player {
    BotDiffculty botDiffculty;
    BotDifficultStrategy botDifficultStrategy;

    public Bot(PlayerType playerType, Symbol symbol,int id,String name,BotDiffculty botDiffcultylevel ) {
        super(playerType, symbol, name, id);
        this.botDiffculty = botDiffcultylevel;
        this.botDifficultStrategy = BotDifficultyStrategyFactory.getBotStrategylevel(botDiffculty);

    }


    @Override
    public Move makeMove(Board board) {

        return botDifficultStrategy.makeMove(board,this);

    }
}
