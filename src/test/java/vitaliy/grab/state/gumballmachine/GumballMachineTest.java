package vitaliy.grab.state.gumballmachine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static vitaliy.grab.state.gumballmachine.GumballMachine.*;

/**
 * Oywayten 18.08.2023.
 */

class GumballMachineTest {

    @Test
    void whenCreateGumballMachineThenToStringIsGumballMachineStateIs1CountIs5() {
        GumballMachine gumballMachine = new GumballMachine(5);
        String actual = gumballMachine.toString();
        String expected = "GumballMachine{state=1, count=5}";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void whenInsertQuarterThenNoticeIsYouPutInAQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        String actualNotice = gumballMachine.insertQuarter();
        String expectedNotice = "You inserted a quarter";
        assertThat(actualNotice).isEqualTo(expectedNotice);
    }

    @Test
    void whenInsertQuarterThenStateIsHasQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        int actualState = gumballMachine.getState();
        assertThat(actualState).isEqualTo(HAS_QUARTER);
    }

    @Test
    void whenInsertQuarterAndTurnCrankThenNoticeIsGumballComesRollingOutTheSlot() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        String actual = gumballMachine.turnCrank();
        String expected = "A gumball comes rolling out the slot";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterAndTurnCrankThenStateIsNoQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        int actual = gumballMachine.getState();
        assertThat(actual).isEqualTo(NO_QUARTER);
    }

    @Test
    void whenInsertQuarterAndTurnCrankThenCountIs4() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        int actual = gumballMachine.getCount();
        int expected = 4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenCreateEmptyGumballMachineAndInsertQuarterAndTurnCrankThenNoticeIsYouCantInsertQuarterAndTurnChank() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        String actual = gumballMachine.turnCrank();
        String expected = "You can’t insert a quarter and turn crank, the machine is sold out";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenCreateEmptyGumballMachineAndInsertQuarterAndTurnCrankThenStateIsSoldOut() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        int actual = gumballMachine.getState();
        assertThat(actual).isEqualTo(SOLD_OUT);
    }

    @Test
    void whenCreateEmptyGumballMachineAndInsertQuarterAndTurnCrankThenCountIs0() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        int actual = gumballMachine.getCount();
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenCreateEmptyGumballMachineAndInsertQuarterAndEjectThenNoticeIsYouCantInsertAndEjectQuarter() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        String actual = gumballMachine.ejectQuarter();
        String expected = "You can’t insert and eject a quarter, the machine is sold out";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterAndEjectThenNoticeIsQuarterReturned() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        String actual = gumballMachine.ejectQuarter();
        String expected = "Quarter returned";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterTwiceThenNoticeIsYouCantInsertAnotherQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        String actual = gumballMachine.insertQuarter();
        String expected = "You can’t insert another quarter";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterAndTurnCrankRepeat5TimesThenNoticeIsOopsOutOfGumballs() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        String actual = gumballMachine.turnCrank();
        String expected = "Oops, out of gumballs!";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterAndTurnCrankRepeat6TimesThenNoticeIsYouCantInsertQuarterAndTurnChank() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        String actual = gumballMachine.turnCrank();
        String expected = "You can’t insert a quarter and turn crank, the machine is sold out";
        assertThat(actual).isEqualTo(expected);
    }
}
