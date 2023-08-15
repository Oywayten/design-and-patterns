package vitaliy.grab.factorymethod;

/**
 * Oywayten 29.07.2023.
 */

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Pepperoni Sauce";
        toppings.add("Pepperoni");
    }

    @Override
    void bake() {
        System.out.println("Bake for 35 minutes at 300");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
