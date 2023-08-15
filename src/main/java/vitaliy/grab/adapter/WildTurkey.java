package vitaliy.grab.adapter;

/**
 * Oywayten 05.08.2023.
 */

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
