package project.snakeandladder;

import project.snakeandladder.entity.*;
import project.snakeandladder.entity.Snake.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Snake snake = SnakeBuilder.builder()
                .setHead(25)
                .setTail(18)
                .build();

        Snake snake1 = SnakeBuilder.builder()
                .setHead(45)
                .setTail(27)
                .build();

        Snake snake2 = SnakeBuilder.builder()
                .setHead(99)
                .setTail(63)
                .build();
        Snake snake4 = SnakeBuilder.builder()
                .setHead(76)
                .setTail(42)
                .build();

        List<Snake> snakes = new ArrayList<>();
        snakes.add(snake);
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake4);


        Ladder ladder = Ladder.LadderBuilder.builder()
                .setFoot(6)
                .setCeil(25)
                .build();

        Ladder ladder1 = Ladder.LadderBuilder.builder()
                .setFoot(34)
                .setCeil(69)
                .build();

        Ladder ladder2 = Ladder.LadderBuilder.builder()
                .setFoot(53)
                .setCeil(82)
                .build();

        Ladder ladder3 = Ladder.LadderBuilder.builder()
                .setFoot(22)
                .setCeil(45)
                .build();

        Ladder ladder4 = Ladder.LadderBuilder.builder()
                .setFoot(18)
                .setCeil(56)
                .build();

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(ladder);
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        ladders.add(ladder4);




        Player player = new Player("Gaurav", Color.RED);
        Player player2 = new Player("Saurav", Color.BLUE);
        Player player3 = new Player("Shubham", Color.GREEN);
        final Deque<Player> players = new ArrayDeque<>();
        players.add(player);
        players.add(player2);
        players.add(player3);
        Map<Player, Integer> map =  new HashMap<>();
        for(Player p: players){
            map.put(p, 0);
        }
        Dice dice = new Dice(2);
        GameBoard gameBoard = new GameBoard(200, snakes, ladders, players, dice, map);
        gameBoard.startGame();
    }
}
