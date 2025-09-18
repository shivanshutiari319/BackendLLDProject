package Tic_tak_toe.Strategy;

import Tic_tak_toe.Model.Board;
import Tic_tak_toe.Model.Move;

public class RowWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
