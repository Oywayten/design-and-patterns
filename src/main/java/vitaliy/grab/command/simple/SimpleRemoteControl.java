package vitaliy.grab.command.simple;

/**
 * Oywayten 02.08.2023.
 */

public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
