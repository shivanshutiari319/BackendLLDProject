package Tic_tak_toe.Model;

public class Cell {
    private int row;
    private int col;
    private CellType cellType;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellType = CellType.EMPTY;
        this.player =null;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Player getPlayer() {
        return player;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void display(){
        if(cellType==CellType.EMPTY){
            System.out.print("|-|");

        }
        else {
            System.out.print("|" + player.getSymbol().getName() + "|" );

        }

    }
}
