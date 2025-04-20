package project.ticTacToe.entity;


public class Board {

    private final Piece[][] board;


    public Board(int size) {
        board = new Piece[size][size];
    }

    public Piece[][] getBoard() {
        return board;
    }

    public boolean addPiece(int row, int column, Piece piece) {
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = piece;
        return true;
    }


    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkWinner(Piece piece, int row, int column) {
        int size = board.length;
        Piece[][] pieceBoard = board;
        //check for row
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        for (int i = 0; i < size; i++) {
            if (pieceBoard[row][i] != piece) {
                rowMatch = false;
                break;
            }

        }
        for (int i = 0; i < size; i++) {
            if (pieceBoard[i][column] != piece) {
                columnMatch = false;
                break;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (pieceBoard[i][j] != piece) {
                    diagonalMatch = false;
                    break;
                }
            }
        }
        return rowMatch || columnMatch || diagonalMatch;
    }

}
