package vitaliy.grab.templatemethod.starbuzzcoffee;

/**
 * Oywayten 06.08.2023.
 */

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();

    protected boolean customerWantsCondiments() {
        return true;
    }
}
