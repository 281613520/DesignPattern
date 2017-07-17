package StructuralPatterns.DecoratorPattern;

/**
 * Created by Ankh on 2017/7/17.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        Shape redCircle = new RedShapeDecorator(new Circle());

        redCircle.draw();

        redRectangle.draw();

        circle.draw();
    }
}
