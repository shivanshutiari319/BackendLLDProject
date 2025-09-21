package Tic_tak_toe.factory;

import Tic_tak_toe.Model.BotDiffculty;
import Tic_tak_toe.Strategy.BotDifficultStrategy;
import Tic_tak_toe.Strategy.EasyDifficultyLevel;
import Tic_tak_toe.Strategy.HardDifficultyLevel;
import Tic_tak_toe.Strategy.MediumDifficultyLevel;

public class BotDifficultyStrategyFactory {

    private BotDiffculty botDiffculty;
    public static BotDifficultStrategy getBotStrategylevel(BotDiffculty botDiffculty){
        BotDifficultStrategy botDifficultyStrategy = null;
        if(botDiffculty == BotDiffculty.EASY){
            botDifficultyStrategy = new EasyDifficultyLevel();
        }
        else if(botDiffculty == BotDiffculty.MEDIUM){
            botDifficultyStrategy= new MediumDifficultyLevel();
        }
        else if(botDiffculty == BotDiffculty.HARD){
            botDifficultyStrategy= new HardDifficultyLevel();
        }
        else {
            throw new IllegalArgumentException("Bot Difficulty Strategy Not Found");
        }
        return botDifficultyStrategy;
    }
}
