package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class SinglePatternDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();

        singletonObject.print();
    }
}
