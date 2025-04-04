package project.ticTacToe.entity;


public class Board {

    private final int size;

    private final Piece[][] board;

    public Piece[][] getBoard() {
        return board;
    }

    public Board(int size){
        this.size = size;
        board = new Piece[size][size];
    }
}
