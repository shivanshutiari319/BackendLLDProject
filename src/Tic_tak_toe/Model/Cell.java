package Tic_tak_toe.Model;

public class Cell {
    private int row;
    private int col;
    private CellType value;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.value = CellType.EMPTY;
        this.player =null;
    }
}
