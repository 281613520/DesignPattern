package CreationalPatterns.BuilderPattern;

/**
 * Created by Ankh on 2017/7/13.
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "ChickBurger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
