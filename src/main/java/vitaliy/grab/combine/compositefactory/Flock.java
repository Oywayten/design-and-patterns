package vitaliy.grab.combine.compositefactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Oywayten 28.08.2023.
 */

public class Flock implements Quackable {

    private final List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }



    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }
}
