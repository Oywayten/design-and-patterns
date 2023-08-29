package vitaliy.grab.combine.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
	List<Observer> observers = new ArrayList<>();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
