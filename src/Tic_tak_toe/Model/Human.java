package Tic_tak_toe.Model;

import java.util.Scanner;

public class Human extends Player{
    int level;
   private int coins;
   public Human(PlayerType playerType, Symbol symbol,int id,String name) {
       super(playerType, symbol, name, id);
       this.level = 1;
       this.coins = 50;
   }


    @Override
    public Move makeMove(Board board) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Hey ,"+ this.getName() +"its your turn");
        System.out.println("enter row index");
        int row = sc.nextInt();
        System.out.println("enter column index");
        int column = sc.nextInt();
        return new Move(new Cell(row,column),this);


    }
}
