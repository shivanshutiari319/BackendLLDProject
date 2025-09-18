package Tic_tak_toe.Strategy;

import Tic_tak_toe.Model.Board;
import Tic_tak_toe.Model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

}
