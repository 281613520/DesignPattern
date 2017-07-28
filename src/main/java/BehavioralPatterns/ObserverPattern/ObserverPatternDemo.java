package BehavioralPatterns.ObserverPattern;

/**
 * Created by Ankh on 2017/7/28.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();


        FirstObserver firstObserver = new FirstObserver(subject);
        SecondObserver secondObserver = new SecondObserver(subject);
        ThirdObserver thirdObserver = new ThirdObserver(subject);
        subject.add(firstObserver);
        subject.add(secondObserver);
        subject.add(thirdObserver);

        subject.setState(2);
        subject.setState(4);

    }
}
