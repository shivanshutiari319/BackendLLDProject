package Tic_tak_toe.controller;

import Tic_tak_toe.Model.*;
import Tic_tak_toe.Strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    Scanner scanner = new Scanner(System.in);
    public Game Controller(){
        //1. ask for the size of board
        int size = getBoardSize();
        //2. ask for list of player
        List<Player>players = getPlayers(size);

        //3. ask for winning strategy
        List<WinningStrategy>  winningStrategies = new ArrayList<>();

        return new Game(size,players,winningStrategies);

    }

    private int getBoardSize(){
        System.out.println("Pleae input size  of board");
        int size = scanner.nextInt();
        scanner.nextLine();
        return size;

    }

    public List<Player> getPlayers(int size){
        System.out.println("Please enter  player and symbol");
        List<Player> playerList = new ArrayList<>();
        for(int i = 0; i < size-1; i++){
            System.out.println("Player details format: name symbol");
            String[] details = scanner.nextLine().split(" ");
            Player player = new Human(PlayerType.HUMAN,new Symbol(details[1]),i,details[0]);
            playerList.add(player);
        }
        return playerList;

    }

    public void displayBoard(Game game){

      game.getBoard().display();
    }

    public void makeMove(){

    }

}
