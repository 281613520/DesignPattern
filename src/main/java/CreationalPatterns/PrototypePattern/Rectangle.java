package CreationalPatterns.PrototypePattern;

/**
 * Created by Ankh on 2017/7/15.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
