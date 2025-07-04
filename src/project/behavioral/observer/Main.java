package project.behavioral.observer;

public class Main {

    public static void main(String[] args) {
       Publisher topic = new Topic("observer-pattern", "to test observer pattern");

       Observer sub1 = new Subscriber("gaurav");
        Observer sub2 = new Subscriber("saurav");
        topic.subscribe(sub1);
        topic.publish("first message on topic");

        topic.subscribe(sub2);
        topic.publish("added second subscriber");

        topic.unsubscribe(sub1);
        topic.publish("removed first subscriber");

    }
}
