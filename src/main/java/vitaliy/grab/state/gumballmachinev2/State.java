package vitaliy.grab.state.gumballmachinev2;

/**
 * Oywayten 19.08.2023.
 */

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
