package Tic_tak_toe.Model;

import Tic_tak_toe.Strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public  class Game {
    Board board;
    List<Player> players;
    private int nextPlayer;
    private GameState gameState;
    private List<Move> moves;
    private Player winner;
    private List<WinningStrategy> winningStrategy;

    public Game(int size, List<Player> players,List<WinningStrategy>  winningStrategy) {
        this.board = new Board(size);
        this.players = players;
        this.winningStrategy = winningStrategy;
        this.nextPlayer = 0;
        this.gameState = GameState.PLAYING;
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<WinningStrategy> getWinningStrategy() {
        return winningStrategy;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }
}
