package project.creational.factory;

import project.creational.factory.entity.Shape;

import static project.creational.factory.entity.ShapeType.*;

public class Main {

    public static void main(String[] args) {
//        ShapeFactory factory = new ShapeFactory();
//        Shape circle = factory.createShape(SQUARE);
//        System.out.println(circle.getShape());
//        System.out.println(circle.getNumberOfSide());
//
//        Shape rect = factory.createShape(RECTANGLE);
//        System.out.println(rect.getShape());
//        System.out.println(rect.getNumberOfSide());

        String first = "Baeldung";
        String second = "Baeldung";
        System.out.println(first == second); // True

        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        System.out.println(third == fourth); // False
        System.out.println(third == second); // False



    }
}
