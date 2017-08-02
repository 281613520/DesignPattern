package BehavioralPatterns.ChainofResponsibilityPattern;

/**
 * Created by Ankh on 2017/8/2.
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
