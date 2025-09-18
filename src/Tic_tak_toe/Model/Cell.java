package Tic_tak_toe.Model;

public class Cell {
    int row;
    int col;
    CellType value;
    public Cell(int row, int col, CellType value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }
}
