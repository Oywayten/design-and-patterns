package vitaliy.grab.simplefactory;

/**
 * Oywayten 30.07.2023.
 */

public class PizzaStoreTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza clamPizza = pizzaStore.orderPizza(PizzaType.CLAM);
        Pizza cheesePizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Pizza is cooked " + clamPizza.getName());
        System.out.println("Pizza is cooked " + cheesePizza.getName());
    }
}
