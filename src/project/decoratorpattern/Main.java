package project.decoratorpattern;


import project.decoratorpattern.coffee.Coffee;
import project.decoratorpattern.coffee.DecafCoffee;
import project.decoratorpattern.coffee.RegularCoffee;
import project.decoratorpattern.decorator.CreamDecorator;

public class Main {

    public static void main(String[] args) {

        //to use builder to make code more readable

        Coffee decafWithCream = new CreamDecorator(new DecafCoffee());
        System.out.println(decafWithCream.getDescription());
        System.out.println(decafWithCream.getCost());

        Coffee regularWithCream = new CreamDecorator(new RegularCoffee());
        System.out.println(regularWithCream.getDescription());
        System.out.println(regularWithCream.getCost());

    }
}
