package me.strategy;

/**
 * Oywayten 22.07.2023.
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
