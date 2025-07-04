package project.behavioral.observer;

public class Subscriber implements Observer{

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Received update: " + message + "by subscriber - " + name);
    }
}
