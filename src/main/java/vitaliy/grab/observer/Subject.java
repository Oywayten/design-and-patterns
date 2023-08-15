package vitaliy.grab.observer;

/**
 * Oywayten 23.07.2023.
 */

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
