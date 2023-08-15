package vitaliy.grab.simplefactory;

import java.util.Objects;

/**
 * Oywayten 30.07.2023.
 */

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        if (Objects.requireNonNull(type) == PizzaType.CHEESE) {
            pizza = new CheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza();
        } else if (type == PizzaType.CLAM) {
            pizza = new ClamPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new VeggiePizza();
        } else {
            throw new IllegalArgumentException();
        }
        return pizza;
    }
}
