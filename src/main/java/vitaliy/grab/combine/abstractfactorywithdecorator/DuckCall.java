package vitaliy.grab.combine.abstractfactorywithdecorator;

/**
 * Oywayten 28.08.2023.
 */

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
