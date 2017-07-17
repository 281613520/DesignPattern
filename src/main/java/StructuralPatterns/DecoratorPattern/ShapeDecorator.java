package StructuralPatterns.DecoratorPattern;

/**
 * Created by Ankh on 2017/7/17.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
