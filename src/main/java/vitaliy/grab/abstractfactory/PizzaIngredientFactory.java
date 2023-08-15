package vitaliy.grab.abstractfactory;

import vitaliy.grab.abstractfactory.ingredient.*;

/**
 * Oywayten 30.07.2023.
 */

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
