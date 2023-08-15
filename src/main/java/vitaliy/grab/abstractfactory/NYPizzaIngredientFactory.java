package vitaliy.grab.abstractfactory;

import vitaliy.grab.abstractfactory.ingredient.*;

/**
 * Oywayten 30.07.2023.
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    /*
    * Нарезанные пеперони используются и в НьюЙорке, и в Чикаго.
    * */
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    /*
    * Нью-Йорк находится на побережье; в нем используются свежие мидии.
    * Чикаго придется довольствоваться морожеными.
    * */
    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
