package StructuralPatterns.DecoratorPattern;

/**
 * Created by Ankh on 2017/7/17.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
