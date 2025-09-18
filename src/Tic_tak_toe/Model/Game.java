package Tic_tak_toe.Model;

import java.util.List;

public abstract class Game {
    Board board;

    public abstract void move();

    List<Player> players;
    List<Cell>position;

    //public WinningStrategy stratey;



}
