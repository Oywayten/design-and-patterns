package vitaliy.grab.state.gumballmachinev1;

/**
 * Oywayten 18.08.2023.
 */

public class GumballMachine {
    public static final int SOLD_OUT = 0;
    public static final int NO_QUARTER = 1;
    public static final int HAS_QUARTER = 2;
    public static final int SOLD = 3;
    private int state = SOLD_OUT;
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public int getCount() {
        return count;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String insertQuarter() {
        String result = "";
        if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            result = "You inserted a quarter";
        } else if (state == HAS_QUARTER) {
            result = "You can’t insert another quarter";
        } else if (state == SOLD_OUT) {
            result = "You can’t insert a quarter, the machine is sold out";
        } else if (state == SOLD) {
            result = "Please wait, we’re already giving you a gumball";
        }
        return result;
    }

    public String ejectQuarter() {
        String result = "";
        if (state == NO_QUARTER) {
            result = "You haven’t inserted a quarter";
        } else if (state == HAS_QUARTER) {
            result = "Quarter returned";
            state = NO_QUARTER;
        } else if (state == SOLD_OUT) {
            result = "You can’t insert and eject a quarter, the machine is sold out";
        } else if (state == SOLD) {
            result = "Sorry, you already turned the crank";
        }
        return result;
    }

    public String turnCrank() {
        String result = "";
        if (state == NO_QUARTER) {
            result = "You turned but there’s no quarter";
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            result = dispense();
        } else if (state == SOLD_OUT) {
            result = "You can’t insert a quarter and turn crank, the machine is sold out";
        } else if (state == SOLD) {
            result = "Turning twice doesn’t get you another gumball!";
        }
        return result;
    }

    public String dispense() {
        String result = "";
        if (state == NO_QUARTER) {
            result = "You need to pay first";
        } else if (state == HAS_QUARTER) {
            result = "No gumball dispensed";
        } else if (state == SOLD_OUT) {
            result = "No gumball dispensed";
        } else if (state == SOLD) {
            result = "A gumball comes rolling out the slot";
            count = count - 1;
            if (count == 0) {
                result = "Oops, out of gumballs!";
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "GumballMachine{" + "state=" + state + ", count=" + count + '}';
    }
}
