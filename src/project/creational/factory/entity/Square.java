package project.creational.factory.entity;

import static project.creational.factory.entity.ShapeType.*;

public class Square implements Shape{
    @Override
    public ShapeType getShape() {
        return SQUARE;
    }

    @Override
    public int getNumberOfSide() {
        return 4;
    }
}
