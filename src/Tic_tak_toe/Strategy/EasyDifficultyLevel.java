package Tic_tak_toe.Strategy;

import Tic_tak_toe.Model.*;

public class EasyDifficultyLevel implements BotDifficultStrategy{
    @Override
    public Move makeMove(Board board, Player player) {

        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                if(board.getGrid().get(i).get(j).getCellType()== CellType.EMPTY ){
                    return new Move(new Cell(i,j),player);
                }
            }
        }
        return null;
    }
}
