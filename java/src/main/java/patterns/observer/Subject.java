package patterns.observer;

/**
 * Interface for objects so that they can act as event emitters.
 */
public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void change();
}
