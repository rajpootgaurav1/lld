package project.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements  Publisher{

    private final String topicName;
    private final String topicDescription;
    private final List<Observer> observers = new ArrayList<>();
    public Topic(String topicName, String topicDescription) {
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }
    @Override
    public void subscribe(Observer sub) {
        observers.add(sub);
    }

    @Override
    public void unsubscribe(Observer sub) {
    observers.remove(sub);
    }

    @Override
    public void notifySubscribers(String message) {
        for(Observer sub: observers) {
            sub.update("[" + topicName + "] " + message);
        }
    }

    @Override
    public void publish(String message) {
        System.out.println("Publishing message to topic: " + topicName +" - " + message);
        notifySubscribers(message);
    }
}
