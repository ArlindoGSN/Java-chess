package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        position = null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public void updatePosition(Position newPosition) {
        this.position = newPosition;
    }
}
