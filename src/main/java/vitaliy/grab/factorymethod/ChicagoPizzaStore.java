package vitaliy.grab.factorymethod;

/**
 * Oywayten 29.07.2023.
 */

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza(); 
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
