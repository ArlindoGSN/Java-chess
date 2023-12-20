package boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() { // Corrigido o nome do método
        return column;
    }

    public void setColumn(int column) { // Corrigido o nome do método
        this.column = column;
    }

    @Override
    public String toString() {
        return row + " , " + column;
    }
}
