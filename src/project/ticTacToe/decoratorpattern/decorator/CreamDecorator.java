package project.ticTacToe.decoratorpattern.decorator;


import project.ticTacToe.decoratorpattern.coffee.Coffee;

public class CreamDecorator extends CoffeeDecorator {
    private final Coffee coffee;
    public CreamDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +", cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 50;
    }
}
