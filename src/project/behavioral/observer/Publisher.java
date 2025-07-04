package project.behavioral.observer;

public interface Publisher {
    void subscribe(Observer sub);
    void unsubscribe(Observer sub);
    void notifySubscribers(String message);
    void publish(String message);
}
