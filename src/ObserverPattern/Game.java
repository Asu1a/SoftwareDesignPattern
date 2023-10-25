package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Game implements Observed {
    List<Observer> subscribers = new ArrayList<>();
    private String message;

    public void newUpdate(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        if(!subscribers.contains(observer)){
            subscribers.add(observer);
        }
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers){
            observer.update(message);
        }
    }
}
