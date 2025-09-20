package Tic_tak_toe.Model;

public class Human extends Player{
    int level;
   private int coins;
   public Human(PlayerType playerType, Symbol symbol,int id,String name) {
       super(playerType, symbol, name, id);
       this.level = 1;
       this.coins = 50;
   }


}
