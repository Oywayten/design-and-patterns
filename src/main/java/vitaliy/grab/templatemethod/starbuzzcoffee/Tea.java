package vitaliy.grab.templatemethod.starbuzzcoffee;

/**
 * Oywayten 06.08.2023.
 */

public class Tea extends CaffeineBeverage {

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }
}