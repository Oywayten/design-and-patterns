package me.simplefactory;

/**
 * Oywayten 30.07.2023.
 */

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        pizza = switch (type) {
            case CHEESE -> new CheesePizza();
            case PEPPERONI -> new PepperoniPizza();
            case CLAM -> new ClamPizza();
            case VEGGIE -> new VeggiePizza();
        };
        return pizza;
    }
}
