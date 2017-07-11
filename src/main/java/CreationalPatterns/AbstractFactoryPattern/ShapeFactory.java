package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Circle;
import CreationalPatterns.FactoryPattern.Rectangle;
import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.Square;

/**
 * Created by Ankh on 2017/7/11.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (null == shapeType){
            return null;
        }
        if ("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if ("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if ("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
