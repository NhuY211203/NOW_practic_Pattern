package observer;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class ClassRoom implements Subject {
    private String className;
    private List<Observer> observers;
    private String message;

    public ClassRoom(String className) {
        this.className = className;
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}