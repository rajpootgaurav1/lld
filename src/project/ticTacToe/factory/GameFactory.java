package project.ticTacToe.factory;

import project.ticTacToe.entity.Player;
import project.ticTacToe.entity.Piece;

public class GameFactory {
    public static Player createPlayer(String name, Piece piece) {
        return new Player(name, piece);
    }
}
