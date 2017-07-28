package BehavioralPatterns.ObserverPattern;

/**
 * Created by Ankh on 2017/7/28.
 */
public class ThirdObserver implements Observer {
    private SubjectImpl subject;

    public ThirdObserver(SubjectImpl subject) {
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println(subject.getState());
    }
}
