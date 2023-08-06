package me.command.withlambda;

import java.text.MessageFormat;

/**
 * Oywayten 02.08.2023.
 */

public class Light {

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(MessageFormat.format("{0} light is on", name));
    }

    public void off() {
        System.out.println(MessageFormat.format("{0} light is off", name));
    }
}
