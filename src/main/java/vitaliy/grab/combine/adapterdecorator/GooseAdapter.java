package vitaliy.grab.combine.adapterdecorator;

/**
 * Oywayten 28.08.2023.
 */

public class GooseAdapter implements Quackable {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
