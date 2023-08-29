package vitaliy.grab.combine.compositefactory;

/**
 * Oywayten 28.08.2023.
 */

public class QuackCounter implements Quackable {
    private final Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
