package vitaliy.grab.combine.compositefactory;

/**
 * Oywayten 28.08.2023.
 */

public class GooseAdapterFactory extends AbstractGooseFactory {
    @Override
    public GooseAdapter createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
