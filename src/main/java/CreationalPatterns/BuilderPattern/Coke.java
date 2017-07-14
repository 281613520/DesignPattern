package CreationalPatterns.BuilderPattern;

/**
 * Created by Ankh on 2017/7/13.
 */
public class Coke extends Drink {
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 11.0f;
    }
}
