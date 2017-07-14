package CreationalPatterns.BuilderPattern;

/**
 * Created by Ankh on 2017/7/13.
 */
public class Pepsi extends Drink {
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
