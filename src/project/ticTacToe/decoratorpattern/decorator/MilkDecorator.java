package com.lld.project.decoratorpattern.decorator;

import com.lld.project.decoratorpattern.coffee.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    private final Coffee coffee;
    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +", milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 25;
    }
}
