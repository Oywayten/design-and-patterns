package vitaliy.grab.decorator;

/**
 * Oywayten 25.07.2023.
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
