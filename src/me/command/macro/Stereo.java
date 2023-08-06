package me.command.macro;

import java.text.MessageFormat;

/**
 * Oywayten 03.08.2023.
 */

public class Stereo {

    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(MessageFormat.format("{0} stereo is on", location));
    }

    public void setCD() {
        System.out.println(MessageFormat.format("{0} stereo set CD mode", location));
    }

    public void setVolume(int volumeLevel) {
        System.out.println("Stereo volumeLevel set to " + volumeLevel);
    }

    public void off() {
        System.out.println(MessageFormat.format("{0} stereo is off", location));
    }
}
