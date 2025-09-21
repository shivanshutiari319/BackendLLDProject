package Tic_tak_toe.Model;

public class Move {
  private Player player;
  private Cell cell;
  public Move(Cell cell,Player player ) {
    this.player = player;
    this.cell = cell;
  }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public Cell getCell() {
        return cell;
    }
}
