package project.structural.decoratorpattern.coffee;

public class RegularCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Regular coffee";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
