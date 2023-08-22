package vitaliy.grab.proxy.gumballmachinev1;

import java.io.Serial;

/**
 * Oywayten 19.08.2023.
 */

public class SoldOutState implements State {

    @Serial
    private static final long serialVersionUID = 2L;
    private final transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

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

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "All gumballs are sold";
    }
}
