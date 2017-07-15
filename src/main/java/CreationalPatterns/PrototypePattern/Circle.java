package CreationalPatterns.PrototypePattern;

import sun.security.provider.SHA;

/**
 * Created by Ankh on 2017/7/15.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
