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

    private boolean checkWinner(Move move) {
        for(WinningStrategy winningStrategy : winningStrategy){
            if(winningStrategy.checkWinner(board,move)){
                return true;
            }
        }
        return false;
    }

    private boolean checkDraw(Board board) {
        if(moves.size()==board.getSize()*board.getSize()){
            return true;
        }
        return false;
    }

    public Player getWinner() {
        return winner;
    }

    public void  makeMove(){

        Player currentPlayer = players.get(nextPlayer);
        Move move = currentPlayer.makeMove(board);

        try {
            validate(move);
        } catch (Exception e) {
            System.out.println("Please try again");
            return ;
        }
        updateGame( move, currentPlayer);
      if(checkWinner(move)){
          gameState = GameState.FINISHED;
          winner = currentPlayer;
      }
      else if(checkDraw(board)){
          gameState=GameState.DRAW;
          System.out.println("Draw");
      }



    }

    private void updateGame(Move move,Player currentPlayer){
            int row = move.getCell().getRow();
            int col = move.getCell().getCol();
            Cell actualcell = board.getCell(row,col);

            actualcell.setCellType(CellType.FILLED);
            actualcell.setPlayer(currentPlayer);
            nextPlayer++;
            nextPlayer %= players.size();
            move.setCell(actualcell);
            moves.add(move);


    }

    public void validate(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        if(row<0 || col<0 || row> board.getSize()-1 || col>board.getSize()-1){
            throw new RuntimeException("Invalid move.");
        }

        if(board.getCell(row, col).getCellType().equals(CellType.FILLED)){
            System.out.println("Cell is already Filled");
        }

    }


}
