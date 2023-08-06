package me.command.withundo;

import java.text.MessageFormat;

/**
 * Oywayten 03.08.2023.
 */

public class Stereo {

    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(MessageFormat.format("{0} stereo is on", name));
    }

    public void setCD() {
        System.out.println(MessageFormat.format("{0} stereo set CD mode", name));
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }

    public void off() {
        System.out.println("Stereo is off");
    }
}
