package BehavioralPatterns.ObserverPattern;

/**
 * Created by Ankh on 2017/7/28.
 */
public class FirstObserver implements Observer {
    private SubjectImpl subject;

    public FirstObserver(SubjectImpl subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(subject.getState());
    }
}
