package project.ticTacToe.entity;


public class Board {

    private final Piece[][] board;

    public Piece[][] getBoard() {
        return board;
    }

    public Board(int size){
        board = new Piece[size][size];
    }
}
