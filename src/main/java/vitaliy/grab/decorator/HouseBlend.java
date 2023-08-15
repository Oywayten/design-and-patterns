package vitaliy.grab.decorator;

/**
 * Oywayten 25.07.2023.
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
