package vitaliy.grab.state.gumballmachinev2;

/**
 * Oywayten 19.08.2023.
 */

public class SoldOutState implements State {

    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can’t insert and eject a quarter, the machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can’t insert a quarter and turn crank, the machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
