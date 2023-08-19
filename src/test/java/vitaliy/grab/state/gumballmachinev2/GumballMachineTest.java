package vitaliy.grab.state.gumballmachinev2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Oywayten 19.08.2023.
 */

class GumballMachineTest {
    private static ByteArrayOutputStream outputStream;

    @BeforeAll
    public static void setUpBeforeAll() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @BeforeEach
    public void setUpBeforeEach() {
        outputStream.reset();
    }

    @AfterAll
    public static void setUpAfterAll() {
        System.setOut(System.out);
    }

    @Test
    void whenCreateGumballMachineThenToStringIsGumballMachineStateIs1CountIs5() {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);
        String actual = outputStream.toString().trim();
        String expected = "GumballMachine{state=NoQuarterState, count=5}";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterThenPrintlnIsYouPutInAQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        String actual = outputStream.toString().trim();
        String expected = "You inserted a quarter";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterThenStateIsHasQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        State actual = gumballMachine.getState();
        State expected = gumballMachine.getHasQuarterState();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterAndTurnCrankThenPrintAboutInsertQuarterAndTurned() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        String actual = outputStream.toString().trim();
        String expected1 = """
                You inserted a quarter
                You turned...
                A gumball comes rolling out the slot...""";
        String expected2 = """
                You inserted a quarter
                You turned...
                A gumball comes rolling out the slot...
                A gumball comes rolling out the slot...
                YOU’RE A WINNER! You got two gumballs for your quarter""";
        assertThat(removeNewLines(actual)).isIn(removeNewLines(expected1), removeNewLines(expected2)) /*|| actual.equals(expected2)*/;
    }

    private String removeNewLines(String str) {
        return str.replaceAll("\\r\\n|\\r|\\n", "");
    }

    @Test
    void whenInsertQuarterAndTurnCrankThenStateIsNoQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        State actual = gumballMachine.getState();
        State expected1 = gumballMachine.getNoQuarterState();
        State expected2 = gumballMachine.getWinnerState();
        assertThat(actual).isIn(expected1, expected2);
    }

    @Test
    void whenInsertQuarterAndTurnCrankThenCountIs4() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        int actual = gumballMachine.getCount();
        int expected1 = 3;
        int expected2 = 4;
        assertThat(actual).isIn(expected1, expected2);
    }

    @Test
    void whenInsertQuarterAndEjectThenPrintlnIsInsertedQuarterAndQuarterReturned() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        String actual = outputStream.toString().trim();
        String expected = """
                You inserted a quarter
                Quarter returned""";
        assertThat(actual).isEqualToIgnoringNewLines(expected);
    }

    @Test
    void whenInsertQuarterTwiceThenPrintlnIsYouCantInsertAnotherQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        String actual = outputStream.toString().trim();
        String expected = """
                You inserted a quarter
                You can’t insert another quarter""";
        assertThat(actual).isEqualToIgnoringNewLines(expected);
    }

    @Test
    void whenInsertQuarterAndTurnCrankRepeat6TimesThenCountIs0() {
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
        gumballMachine.turnCrank();
        int actual = gumballMachine.getCount();
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenInsertQuarterAndTurnCrankRepeat3TimesThenCountIsLessEqual2() {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        int actual = gumballMachine.getCount();
        int expected = 2;
        assertThat(actual).isLessThanOrEqualTo(expected);
    }

    @Test
    void whenCreateEmptyGumballMachineAndInsertQuarterAndTurnCrankThenPrintlnCantInsertQuarterMachineSoldOut() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        String actual = outputStream.toString().trim();
        String expected1 = """
                You can’t insert a quarter, the machine is sold out
                You can’t insert a quarter and turn crank, the machine is sold out
                No gumball dispensed""";
        assertThat(actual).isEqualToIgnoringNewLines(expected1);
    }

    @Test
    void whenCreateEmptyGumballMachineAndInsertQuarterAndTurnCrankThenStateIsSoldOut() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        State actual = gumballMachine.getState();
        State expected = gumballMachine.getSoldOutState();
        assertThat(actual).isEqualTo(expected);
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
    void whenCreateEmptyGumballMachineInsertQuarterEjectThenPrintlnYouCantInsertAndEjectQuarterMachineSoldOut() {
        GumballMachine gumballMachine = new GumballMachine(0);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        String actual = outputStream.toString().trim();
        String expected = """
                You can’t insert a quarter, the machine is sold out
                You can’t insert and eject a quarter, the machine is sold out""";
        assertThat(actual).isEqualToNormalizingNewlines(expected);
    }
}