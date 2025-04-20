package project.creational.factory.entity;

import static project.creational.factory.entity.ShapeType.CIRCLE;

public class Circle implements Shape {
    @Override
    public ShapeType getShape() {
        return CIRCLE;
    }

    @Override
    public int getNumberOfSide() {
        return 0;
    }
}
