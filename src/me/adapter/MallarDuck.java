package me.adapter;

/**
 * Oywayten 05.08.2023.
 */

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
