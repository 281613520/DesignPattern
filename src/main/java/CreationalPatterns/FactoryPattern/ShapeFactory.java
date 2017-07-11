package CreationalPatterns.FactoryPattern;

/**
 * Created by Ankh on 2017/7/11.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
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
