package vitaliy.grab.abstractfactory;

import vitaliy.grab.abstractfactory.pizza.Pizza;

/**
 * Oywayten 31.07.2023.
 */

public class PizzaStoreTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza itanPizza = nyPizzaStore.orderPizza("clam");
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(itanPizza.getName());
        System.out.println(joelPizza.getName());
    }
}
