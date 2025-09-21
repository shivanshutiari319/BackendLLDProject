package Tic_tak_toe.Strategy;

import Tic_tak_toe.Model.Board;
import Tic_tak_toe.Model.Move;
import Tic_tak_toe.Model.Player;

public interface BotDifficultStrategy  {

      Move makeMove(Board board, Player player);

}
