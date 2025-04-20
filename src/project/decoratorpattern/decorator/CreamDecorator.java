package project.decoratorpattern.decorator;


import project.decoratorpattern.coffee.Coffee;

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
