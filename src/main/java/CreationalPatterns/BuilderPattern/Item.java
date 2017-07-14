package CreationalPatterns.BuilderPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
