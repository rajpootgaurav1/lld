package com.lld.project.decoratorpattern.decorator;

import com.lld.project.decoratorpattern.coffee.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    private final Coffee coffee;
    public SugarDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +", sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10;
    }
}
