package CreationalPatterns.BuilderPattern;

/**
 * Created by Ankh on 2017/7/13.
 */
public abstract class Burger implements Item{
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
