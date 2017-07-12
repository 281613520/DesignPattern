package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class LazyAndSafe {
    private static LazyAndSafe lazyAndSafe;

    public static synchronized LazyAndSafe getInstance(){
        if (lazyAndSafe == null){
            lazyAndSafe = new LazyAndSafe();
        }
        return lazyAndSafe;
    }
}
