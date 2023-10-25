package ObserverPattern;

public interface Observed {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifyObservers();
}
