package CreationalPatterns.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ankh on 2017/7/15.
 */
public class ShapeCache {
    private static Map<String,Shape> cache = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) throws Exception{
        Shape cacheShape = cache.get(shapeId);
        return (Shape)cacheShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        cache.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        cache.put(rectangle.getId(),rectangle);
    }
}
