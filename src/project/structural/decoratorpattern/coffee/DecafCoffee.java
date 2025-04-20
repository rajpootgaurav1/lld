package project.structural.decoratorpattern.coffee;

public class DecafCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Decaf coffee";
    }

    @Override
    public double getCost() {
        return 50;
    }
}
