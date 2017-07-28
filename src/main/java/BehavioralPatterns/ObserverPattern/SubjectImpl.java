package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankh on 2017/7/28.
 */
public class SubjectImpl implements Subject {
    private List<Observer> list = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    public int getState() {
        return state;
    }

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list){
            observer.update();
        }
    }
}
