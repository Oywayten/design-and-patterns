package vitaliy.grab.combine.observer;

public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObservers();
}
