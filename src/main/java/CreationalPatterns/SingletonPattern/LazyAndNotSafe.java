package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class LazyAndNotSafe {
    private LazyAndNotSafe lazyAndNotSafe;

    public LazyAndNotSafe getInstance(){
        if (lazyAndNotSafe == null){
            lazyAndNotSafe = new LazyAndNotSafe();
        }
        return lazyAndNotSafe;
    }
}
