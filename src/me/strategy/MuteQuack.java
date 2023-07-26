package me.strategy;

/**
 * Oywayten 22.07.2023.
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
