package vitaliy.grab.decorator;

/**
 * Oywayten 25.07.2023.
 */

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
