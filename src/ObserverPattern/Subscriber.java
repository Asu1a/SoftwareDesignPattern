package ObserverPattern;

public class Subscriber implements Observer {

    public void update(String message) {
        System.out.println("New update: " + message);
    }
}
