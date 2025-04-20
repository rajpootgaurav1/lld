package project.creational.factory;

import project.creational.factory.entity.*;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
        };
    }


}
