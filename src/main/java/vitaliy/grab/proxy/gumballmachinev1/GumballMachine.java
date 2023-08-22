package vitaliy.grab.proxy.gumballmachinev1;

import java.io.Serial;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Oywayten 18.08.2023.
 */

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    @Serial
    private static final long serialVersionUID = 2L;
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;
    private final String location;
    private State state;
    private int count;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public String getLocation() {
        return location;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        if (count > 0) {
            this.count += count;
            state.refill();
            System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        } else {
            System.out.println("Invalid refill count");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" + "state=" + state.getClass().getSimpleName() + ", count=" + count + '}';
    }
}
