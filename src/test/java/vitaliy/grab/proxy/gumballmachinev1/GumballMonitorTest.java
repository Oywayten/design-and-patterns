package vitaliy.grab.proxy.gumballmachinev1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.rmi.RemoteException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Oywayten 21.08.2023.
 */

class GumballMonitorTest {

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
    void whenTestThenTrue() throws RemoteException {
        String location = "L&A, Center";
        int count = 100;
        GumballMachine gumballMachine = new GumballMachine(location, count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
        String actual = outputStream.toString().trim();
        String expected = """
                Gumball Machine: L&A, Center
                Current inventory: 100 gumballs
                Current state: waiting for quarter""";
        assertThat(actual).isEqualToIgnoringNewLines(expected);
    }

}