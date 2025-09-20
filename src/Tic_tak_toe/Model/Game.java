package Tic_tak_toe.Model;

import Tic_tak_toe.Strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public abstract class Game {
    Board board;
    List<Player> players;
    private int nextPlayer;
    private GameState gameState;
    private List<Move> moves;
    private Player winner;
    private WinningStrategy winningStrategy;

    public Game(Board board, List<Player> players, WinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.winningStrategy = winningStrategy;
        this.nextPlayer = 0;
        this.gameState = GameState.PLAYING;
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public abstract void move();

}
