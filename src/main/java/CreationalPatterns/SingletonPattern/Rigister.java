package CreationalPatterns.SingletonPattern;

/**
 * Created by Ankh on 2017/7/12.
 */
public class Rigister {
    private static class Holder{
        private static final Rigister rigister = new Rigister();
    }

    private Rigister(){

    }

    public static Rigister getInstance(){
        return Holder.rigister;
    }
}
