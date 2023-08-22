package vitaliy.grab.proxy.gumballmachinev1;

import java.io.Serial;

/**
 * Oywayten 19.08.2023.
 */

public class NoQuarterState implements State {

    @Serial
    private static final long serialVersionUID = 2L;
    private final transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there’s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {
        System.out.println("Gumball machine not refilled");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
