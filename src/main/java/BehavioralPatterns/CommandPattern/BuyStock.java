package BehavioralPatterns.CommandPattern;

/**
 * Created by Ankh on 2017/8/2.
 */
public class BuyStock implements Order {
    private Stock abcstock;

    public BuyStock(Stock abcstock) {
        this.abcstock = abcstock;
    }

    @Override
    public void execute() {
        abcstock.buy();
    }
}
