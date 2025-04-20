package project.creational.factory.entity;

import static project.creational.factory.entity.ShapeType.RECTANGLE;

public class Rectangle implements Shape{
    @Override
    public ShapeType getShape() {
        return RECTANGLE;
    }

    @Override
    public int getNumberOfSide() {
        return 4;
    }
}
