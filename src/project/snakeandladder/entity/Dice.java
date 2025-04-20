package project.snakeandladder.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Dice {
    private int numOfDices;


    public int rollDice() {
        int lowBound = this.numOfDices;
        int highBound = this.numOfDices*6;
        return (int) (Math.random()*(highBound-lowBound+1)) + lowBound;
        //take random till n dice and then add total dice number to it as that would be the minimum
    }

}
