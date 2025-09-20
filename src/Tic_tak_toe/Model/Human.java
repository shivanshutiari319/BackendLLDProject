package Tic_tak_toe.Model;

public class Human extends Player{
    int level;
   private int coins;
   public Human(PlayerType playerType, Symbol symbol,int id,String name,int level,int coins) {
       super(playerType, symbol, name, id);
       this.level = 1;
       this.coins = 50;
   }


}
