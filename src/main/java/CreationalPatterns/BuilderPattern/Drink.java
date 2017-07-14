package CreationalPatterns.BuilderPattern;

/**
 * Created by Ankh on 2017/7/13.
 */
public abstract class Drink implements Item{

    public Packing packing() {
        return new Bottle();
    }


    public abstract float price();
}
