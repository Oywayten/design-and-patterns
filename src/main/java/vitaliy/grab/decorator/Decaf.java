package vitaliy.grab.decorator;

/**
 * Oywayten 25.07.2023.
 */

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
