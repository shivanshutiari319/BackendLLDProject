package Tic_tak_toe.Strategy;

import Tic_tak_toe.Model.Board;
import Tic_tak_toe.Model.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<String,Integer>> rowWinning = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getName();
        if(!rowWinning.containsKey(row)){
            rowWinning.put(row,new HashMap<>());

        }else if(!rowWinning.get(row).containsKey(symbol)){
            rowWinning.get(row).put(symbol,1);

        }
        rowWinning.get(row).put(symbol,rowWinning.get(row).get(symbol)+1);

        return   rowWinning.get(row).get(symbol) == board.getSize();
    }

}
