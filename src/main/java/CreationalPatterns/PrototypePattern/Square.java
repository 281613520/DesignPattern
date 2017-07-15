package CreationalPatterns.PrototypePattern;

/**
 * Created by Ankh on 2017/7/15.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
