package me.templatemethod.starbuzzcoffee;

/**
 * Oywayten 06.08.2023.
 */

public class StarbuzzTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
