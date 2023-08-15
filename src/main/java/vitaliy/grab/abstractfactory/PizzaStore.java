package vitaliy.grab.abstractfactory;

import vitaliy.grab.abstractfactory.pizza.Pizza;

/**
 * Oywayten 31.07.2023.
 */

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        preparePizza(pizza);
        return pizza;
    }

    private static void preparePizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);
}
