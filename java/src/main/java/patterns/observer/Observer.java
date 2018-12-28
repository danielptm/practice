package patterns.observer;

/**
 * Interface for objects to implement so that they can subscribe to events emitted by classes implementing the
 * Subject interface.
 */
public interface Observer {

    void update();
}
