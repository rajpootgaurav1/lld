package project.ticTacToe.service;


import project.ticTacToe.entity.Board;
import project.ticTacToe.entity.Piece;

public class BoardService {

    public boolean addPiece(int row, int column, Piece piece, final Board board) {
        Piece[][] pieceBoard = board.getBoard();
        if (pieceBoard[row][column] != null) {
            return false;
        }
        pieceBoard[row][column] = piece;
        return true;
    }

    public void printBoard(final Board board) {
        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard().length; j++) {
                if (board.getBoard()[i][j] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board.getBoard()[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkWinner(final Board board, Piece piece, int row, int column) {
        int size = board.getBoard().length;
        Piece[][] pieceBoard = board.getBoard();
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
