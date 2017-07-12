package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class Hungry {
    private static Hungry hungry = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance(){
        return hungry;
    }
}
