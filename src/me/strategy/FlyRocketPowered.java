package me.strategy;

/**
 * Oywayten 22.07.2023.
 */

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
