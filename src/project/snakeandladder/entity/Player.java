package project.snakeandladder.entity;

import lombok.*;

@Getter
public class Player {
    private static int idCounter = 0;
    private final int playerId;
    private final String playerName;
    private final Color color;

    private static synchronized int generateId() {
        return ++idCounter;
    }

    public Player(final String playerName, final Color color) {
        this.playerId = generateId();
        this.playerName = playerName;
        this.color = color;
    }
}
