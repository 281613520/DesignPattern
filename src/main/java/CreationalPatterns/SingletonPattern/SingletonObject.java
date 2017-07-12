package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class SingletonObject {
    private static SingletonObject singletonObject = new SingletonObject();

    public static SingletonObject getInstance(){
        return singletonObject;
    }

    public void print(){
        System.out.println("hello");
    }
}
