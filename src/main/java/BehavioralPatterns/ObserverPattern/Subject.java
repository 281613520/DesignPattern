package BehavioralPatterns.ObserverPattern;

/**
 * Created by Ankh on 2017/7/28.
 */
public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObserver();
}