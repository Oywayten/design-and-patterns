package me.command.withlambda;

import java.text.MessageFormat;

/**
 * Oywayten 03.08.2023.
 */

public class CeilingFan {
    private final String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void high() {
        System.out.println(MessageFormat.format("{0} ceiling fan is high mode", name));
    }

    public void off() {
        System.out.println(MessageFormat.format("{0} ceiling fan is off", name));
    }
}
