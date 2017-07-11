package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Shape;

/**
 * Created by Ankh on 2017/7/11.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

    }
}
