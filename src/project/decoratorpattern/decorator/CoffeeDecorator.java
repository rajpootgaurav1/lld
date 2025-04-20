package project.decoratorpattern.decorator;


import project.decoratorpattern.coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;
    //this wil have the base coffee object which we need to decorate with more items
}
