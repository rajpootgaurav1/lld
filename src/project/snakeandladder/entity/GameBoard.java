package project.snakeandladder.entity;

import lombok.AllArgsConstructor;


import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
public class GameBoard {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Deque<Player> players;
    private Dice dice;
    private Map<Player, Integer> currentPositionMap;

    public void startGame() {
        System.out.println("game started!!!");
        while (players.size() > 1) {
            Player player = players.poll();
            int currentPosition = currentPositionMap.get(player);
            int diceVal = dice.rollDice();
            int nextCell = currentPosition + diceVal;
            String format = String.format("chance of player %s and current position is %s and dice val is %s",
                    player.getPlayerName(), currentPosition, diceVal);
            System.out.println(format);
            if (nextCell == size) {
                String formatted = String.format("Player %s has won the game with color %s", player.getPlayerName(), player.getColor());
                System.out.println(formatted);
            } else if (nextCell > size) {
                //first check if the value is going overlimit then we don't need to add the new val
                players.addLast(player);
            } else {
                if (!(checkSnakes(nextCell, player) || checkLadders(nextCell, player))) {
                    currentPositionMap.put(player, nextCell);
                }
                players.addLast(player);
            }
        }


        System.out.println("game ended!!!");
    }

    private boolean checkLadders(int currentPosition, Player player) {
        for (Ladder ladder : ladders) {
            if (Objects.equals(ladder.getFoot(), currentPosition)) {
                String formatted = String.format("Yayy, the ladder took %s from %s and move to %s", player.getPlayerName(), ladder.getFoot(), ladder.getCeil());
                System.out.println(formatted);
                currentPositionMap.put(player, ladder.getCeil());
                return true;
            }
        }
        return false;
    }

    private boolean checkSnakes(int currentPosition, Player player) {
        for (Snake snake : snakes) {
            if (Objects.equals(snake.getHead(), currentPosition)) {
                String formatted = String.format("Awww, the snake bit %s at %s and move to %s", player.getPlayerName(), snake.getHead(), snake.getTail());
                System.out.println(formatted);
                currentPositionMap.put(player, snake.getTail());
                return true;
            }
        }
        return false;
    }

}
