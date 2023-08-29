package vitaliy.grab.combine.abstractfactory;

/**
 * Oywayten 28.08.2023.
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator:");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}