package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class DoubleCheck {
    private static volatile DoubleCheck doubleCheck;

    private DoubleCheck(){

    }

    public static DoubleCheck getInstance(){
        if (doubleCheck == null){
            synchronized (DoubleCheck.class){
                if (doubleCheck == null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
