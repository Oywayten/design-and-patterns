package vitaliy.grab.command.withundo;

import java.text.MessageFormat;

/**
 * Oywayten 03.08.2023.
 */

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(MessageFormat.format("{0} ceiling fan is high mode", location));
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(MessageFormat.format("{0} ceiling fan is medium mode", location));
    }

    public void low() {
        speed = LOW;
        System.out.println(MessageFormat.format("{0} ceiling fan is low mode", location));
    }

    public void off() {
        speed = OFF;
        System.out.println(MessageFormat.format("{0} ceiling fan is off", location));
    }

    public int getSpeed() {
        return speed;
    }
}
