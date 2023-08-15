package vitaliy.grab.command.macro;

import java.text.MessageFormat;

/**
 * Oywayten 04.08.2023.
 */

public class TV {

    private final String location;
    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(MessageFormat.format("{0} TV is on", location));
    }

    public void off() {
        System.out.println(MessageFormat.format("{0} TV is off", location));
    }
}
