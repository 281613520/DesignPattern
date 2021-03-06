package BehavioralPatterns.ChainofResponsibilityPattern;

/**
 * Created by Ankh on 2017/8/2.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
