package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Shape;

/**
 * Created by Ankh on 2017/7/11.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
