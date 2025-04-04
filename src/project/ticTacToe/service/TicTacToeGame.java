package project.ticTacToe.service;



import project.ticTacToe.entity.Board;
import project.ticTacToe.entity.Player;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import static project.ticTacToe.entity.Piece.O;
import static project.ticTacToe.entity.Piece.X;

public class TicTacToeGame {

    private Deque<Player> chanceToMove;
    private Board board;
    private int totalMoveLeft;
    private final BoardService boardService;

    public TicTacToeGame() {
        initializeGame();
        boardService = new BoardService();
    }

    private void initializeGame() {
        Player player1 = new Player("Utkarsh", X);

        Player player2 =new Player ("Gaurav", O);

        board = new Board(3);
        totalMoveLeft = 3 * 3;

        chanceToMove = new ArrayDeque<>();
        chanceToMove.add(player1);
        chanceToMove.add(player2);

    }

    public String startGame() {
        boolean hasNoWinner = false;
        while (!hasNoWinner) {

            final Player currentPlayer = chanceToMove.pollFirst();

            boardService.printBoard(board);
            //take user input for moving the piece dynamically no hardcoding using actual user input
            System.out.println("Enter the row and column to place your piece");
            int row =(int)(Math.random() * 3);
            int column = (int)(Math.random() * 3);
            assert currentPlayer != null;
            boolean isValidMove = boardService.addPiece(row, column, currentPlayer.getPiece(), board);
            if (!isValidMove) {
                System.out.println("Invalid move, try again");
                chanceToMove.addFirst(currentPlayer);
                continue;
            } else {
                totalMoveLeft--;
                if (totalMoveLeft == 0) {
                    System.out.println("Game Over, No winner");
                    return "tie";
                } else {
                    chanceToMove.addLast(currentPlayer);
                }
            }
            //check if current player has won
            boolean winner = boardService.checkWinner(board, currentPlayer.getPiece(), row, column);
            if (winner) {
                return currentPlayer.getName();
            }

        }
        return "tie";
    }

}
