package Tic_tak_toe.Client;

import Tic_tak_toe.Model.Game;
import Tic_tak_toe.Model.GameState;
import Tic_tak_toe.controller.GameController;

public class GameClient {
    public static void main(String[] args) {


        GameController gameController = new GameController();
       //1. start the game
        Game game  = gameController.Controller();
      //  gameController.displayBoard(game);

//2. keep playing until gamestate in in progress
        while (game.getGameState() == GameState.PLAYING){
            // i. display the board
            gameController.displayBoard(game);

            System.out.println("Welcome to Tic-Tak-toe!");
            //ii. make move
            gameController.makeMove(game);

            // update

            if(game.getGameState() == GameState.FINISHED){
                System.out.println("Game has ended!" + game.getWinner().getName() + "is the winner");
            }
            else if(game.getGameState() == GameState.DRAW){
                System.out.println("Game has ended! Result is draw");
            }

        }


 //3. check winner and declare the result




    }
}
