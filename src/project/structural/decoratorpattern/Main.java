package project.structural.decoratorpattern;


import project.structural.decoratorpattern.coffee.Coffee;
import project.structural.decoratorpattern.coffee.DecafCoffee;
import project.structural.decoratorpattern.coffee.RegularCoffee;
import project.structural.decoratorpattern.decorator.CreamDecorator;
import project.structural.decoratorpattern.decorator.MilkDecorator;
import project.structural.decoratorpattern.decorator.SugarDecorator;

public class Main {

    public static void main(String[] args) {

        //to use builder to make code more readable

        Coffee decafWithCream = new CreamDecorator(new DecafCoffee());
        System.out.println(decafWithCream.getDescription());
        System.out.println(decafWithCream.getCost());

        Coffee regularWithCreamAndSugar = new SugarDecorator(new MilkDecorator(new RegularCoffee()));
        System.out.println(regularWithCreamAndSugar.getDescription());
        System.out.println(regularWithCreamAndSugar.getCost());

    }
}
