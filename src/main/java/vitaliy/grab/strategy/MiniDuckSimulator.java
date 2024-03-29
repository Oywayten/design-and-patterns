package vitaliy.grab.strategy;

/**
 * Oywayten 22.07.2023.
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
